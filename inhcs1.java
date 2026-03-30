class Accounts {
    protected double balance;

    Accounts(double balance) {
        this.balance = balance;
    }

    double calculateInterest() {
        return balance * 0.02;
    }
}

class SavingsAccount extends Accounts {

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        double interest = balance * 0.04;

        if (balance > 50000) {
            interest += 500;
        }

        return interest;
    }
}

class FixedDeposit extends SavingsAccount {

    FixedDeposit(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        double interest = super.calculateInterest();
        interest += balance * 0.02;
        return interest;
    }
}

public class inhcs1 {
    public static void main(String[] args) {

        Accounts acc1 = new SavingsAccount(10000);
        System.out.println(acc1.calculateInterest());

        Accounts acc2 = new SavingsAccount(60000);
        System.out.println(acc2.calculateInterest());

        Accounts acc3 = new FixedDeposit(60000);
        System.out.println(acc3.calculateInterest());
    }
}