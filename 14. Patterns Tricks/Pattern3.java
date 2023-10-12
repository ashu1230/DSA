public class Pattern3 {

    // * * * * * 
    // * * * *
    // * * *
    // * *
    // *

    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            // for every row, run the col..
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline...
            System.out.println();
        }
    }
}
