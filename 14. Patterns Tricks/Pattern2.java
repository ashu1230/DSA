public class Pattern2 {


    // * 
    // * *
    // * * *
    // * * * *
    // * * * * *

    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            // for every row, run the col..
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline...
            System.out.println();
        }
    }
}
