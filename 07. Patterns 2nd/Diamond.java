public class Diamond {
    
    public static void diamond(int n) {
        for (int i=1; i<=n; i++) {
            // First Half....
            for (int j=1; j<=n-i; j++){
              System.out.print(" ");
            }

            for (int j = 1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Second half....
        for (int i=n; i>=1; i--) {
            for (int j=1; j<=n-i; j++){
              System.out.print(" ");
            }

            for (int j = 1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) {
        diamond(5);
    }
}
