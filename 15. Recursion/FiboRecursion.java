public class FiboRecursion {
    public static void main(String[] args) {
        System.out.println(fibo(8));
    }

    static int fibo (int n) {

        if(n < 2){ 
            return 2;
        }

         return fibo(n-1)+fibo(n-2);
    }
}
