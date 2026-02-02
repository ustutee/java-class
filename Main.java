class Counter {
    static int count = 0;

    Counter() {
        count++;
        System.out.println("object created. current count:" + count);
    } 
}

public class Main {
    public static void main(String[] args) {    
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();
        Counter obj4 = new Counter();
        Counter obj5 = new Counter();

        System.out.println("final count:" + Counter.count);

    }
}
