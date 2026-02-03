class Parent{
    void display(){
        System.out.println("parent class method");
    }
}

class child extends Parent {
    void show(){
        System.out.println("child class methods");
    }
}

public class singleinheritance {
    public static void main(String[] args) {
        child d = new child();
        d.display();
        d.show();
    }
    
}
