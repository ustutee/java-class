class Employee {
    protected String name;
    protected double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return baseSalary + (baseSalary * 0.05);
    }
}

class Manager extends Employee {

    Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        double salary = super.calculateSalary(); 
        salary += 2000; 
        return salary;
    }
}

class Executive extends Manager {

    Executive(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        double salary = super.calculateSalary(); 
        salary += baseSalary * 0.10;
        return salary;
    }
}

public class inhcs2 {
    public static void main(String[] args) {

        Employee e1 = new Employee("Alice", 10000);
        System.out.printf("%.2f\n", e1.calculateSalary()); // 10500.00

        Employee e2 = new Manager("Bob", 10000);
        System.out.printf("%.2f\n", e2.calculateSalary()); // 12500.00

        Employee e3 = new Executive("Charlie", 10000);
        System.out.printf("%.2f\n", e3.calculateSalary()); // 13500.00
    }
}

