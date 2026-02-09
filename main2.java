class Calculator {
    int add(int a, int b) {return a + b;}
    double add(double a, double b) {return a + b;}
    int add(int a, int b, int c) {return a + b + c;}
    
    int sub(int a, int b) {return a - b;}
    double sub(double a, double b) {return a - b;}
    
    int mul(int a, int b) {return a * b;}
    double mul(double a, double b) {return a * b;}

    double div(int a, int b) {return (double) a / b;}
    double div(double a, double b) {return a / b;}
}

public class main2 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Add int: " + calc.add(5, 10));
        System.out.println("Add double: " + calc.add(5.5, 2.2));
        System.out.println("Add 3 int: " + calc.add(2, 1, 4));

        System.out.println("Sub int: " + calc.sub(10, 5));
        System.out.println("Sub double: " + calc.sub(5.5, 2.2));

        System.out.println("Mul int: " + calc.mul(4, 3));
        System.out.println("Mul double: " + calc.mul(2.5, 2.0));

        System.out.println("Div int: " + calc.div(10, 3));
        System.out.println("Div double: " + calc.div(5.5, 2.2));
    }
}

