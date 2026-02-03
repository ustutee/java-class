interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound (){
        System.out.println("dog barks");
    }
}
public class interfaceeg {
    public static void main(String[] args) {
        Animal a = new Dog ();
        a.sound();
    }
    
}
