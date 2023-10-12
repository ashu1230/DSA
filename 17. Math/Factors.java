public class Factors {
    public static void main(String[] args) {
        factors1(20);
        factors1(56);
    }


    // O(n)
    static void factors1(int n){
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.print(i+" ");
            }
        }
    }

    // O(sqrt[n])
    static void factors2(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                if(n/i == i){
                    System.out.print(i +" ");
                }else{
                System.out.print(i+ " " + n/i + " ");
                }
            }
        }
    }
}
