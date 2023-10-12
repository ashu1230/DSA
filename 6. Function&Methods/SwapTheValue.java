public class SwapTheValue {
    public static void swap (int a, int b){
        int swap = a;
        a = b;
        b = swap;
        System.out.println("printed a : " + a);
        System.out.println("printed b : " + b);
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        swap(a, b);
    }
}
