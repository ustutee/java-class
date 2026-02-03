interface Animal {
    void sound();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {

    public void sound() {
        System.out.println("Dog barks");
    }

    public void play() {
        System.out.println("Dog loves to play");
    }
}

public class interfaceeg {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.play();
    }
}
