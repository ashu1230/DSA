public class BasicConcept {
   public static void main(String[] args) {
    fun(10);
   }
   
   static void fun(int n) {
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        fun(--n);       // it Works..
        // fun(n--);    // it not works..

   }
}
