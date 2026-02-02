class Animal {
    void eat() {
        System.out.println("Animal eats flesh!");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks!");
    }
}

class GermanShepherd extends Dog {
    void special() {
        System.out.println("They are special dog breed");
    }
}

public class multilvl {
    public static void main(String[] args) {
        GermanShepherd g = new GermanShepherd();
        g.eat();
        g.bark();
        g.special();
    }    
}

    
