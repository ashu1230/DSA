public class Revers1toN {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n){
        if(n==0){
            return;
        }
        
        fun(n-1);
        System.out.print(n + " ");
    }
}
