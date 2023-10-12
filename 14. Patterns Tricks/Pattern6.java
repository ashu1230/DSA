public class Pattern6 {
    public static void main(String[] args) {
        pattern(5);
    }

    // * 
    // * *
    // * * *
    // * * * *
    // * * * * *
    // * * * *
    // * * * 
    // * * 
    // *

    static void pattern(int n) {
        for (int i = 0; i < 2 * n; i++) {
            // for every row, run the col..
            int totalColInRow = i > n ? 2 * n - i : i;
            for (int j = 0; j < totalColInRow; j++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline...
            System.out.println();
        }
    }
}

