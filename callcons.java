class Demo{
    Demo() {
        this ("Default Constructor");
    }
    Demo(String message) {
        System.out.println(message);        
    }
    Demo(String message, int number){
        System.out.println(message + " " + number);

    }
}
public class callcons {
   public static void main(String[] args) {
         new Demo();
         new Demo("hello");
         new Demo("hi",10);
   }   
}
