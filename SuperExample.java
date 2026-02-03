class GrandParent {
    void display() {
        System.out.println("GrandParent class Method");
    }
}

class Parent extends GrandParent {
    void display() {
        super.display();
        System.out.println("parent Class method");
    }
}

class Child extends Parent {
    void display() {
        super.display();
        System.out.println("Child Class method");
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
