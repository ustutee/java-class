class Parent {
    final void display() {
        System.out.println("final method in parent class");
    }
}

class Child extends Parent {

}
public class finalmethodeg {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
