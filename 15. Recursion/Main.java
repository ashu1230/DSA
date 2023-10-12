public class Main {
    public static void main(String[] args) {
        // WAF that prints hello world..
        message();
    }

    static void message() {
        System.out.println("hello World 1");

        message2();
    }

    static void message2() {
        System.out.println("hello World 2");
        
        message3();
    }

    static void message3() {
        System.out.println("hello World 3");
    
        message4();
    }

    static void message4() {
        System.out.println("hello World 4");
    }

}
