public class ButterflyPattern {
    
    public static void butterflyPattern(int n) {
        // first half....
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }

            for (int j=1; j<=(n-i)*2; j++){
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Second half....
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }

            for (int j=1; j<=(n-i)*2; j++){
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) {
        butterflyPattern(5);
    }
}
