import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 
        
        int n = scanner.nextInt(); 

        int ans = 0;
        int base = 5;
        while(n>0) {
            int last = n&1;
            n=n>>1;
            ans +=last*base;
            base = base*5;
        }
        System.out.println(ans);
        scanner.close();
    }
}
