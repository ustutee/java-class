abstract class Payment {
    private String transactionId;
    private double amount;


    Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    abstract double processPayment();
}

class CreditCardPayment extends Payment {

    CreditCardPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    @Override
    double processPayment() {
        return getAmount() + (getAmount() * 0.02);
    }
}

class UPIPayment extends Payment {
    private String upiId;

    UPIPayment(String transactionId, double amount, String upiId) {
        super(transactionId, amount);
        this.upiId = upiId;
    }

    @Override
    double processPayment() {
        if (upiId == null || !upiId.contains("@")) {
            System.out.println("Invalid UPI ID!");
            return 0;
        }
        return getAmount(); 
    }
}

class PaymentProcessor {

    public static double processAll(Payment[] payments) {
        double total = 0;

        for (Payment p : payments) {
            total += p.processPayment(); 
        }

        return total;
    }
}

public class abscs1 {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment("TXN123", 1000.0);
        Payment p2 = new UPIPayment("TXN124", 1000.0, "user@upi");

        System.out.println(p1.processPayment()); // 1020.0
        System.out.println(p2.processPayment()); // 1000.0

        Payment[] payments = {p1, p2};
        double total = PaymentProcessor.processAll(payments);

        System.out.println("Total: " + total); // 2020.0
    }
}
