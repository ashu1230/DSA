public class Pattern5 {
    public static void main(String[] args) {
        pattern(5);
    }

    // 1 
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            // for every row, run the col..
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // when one row is printed, we need to add a newline...
            System.out.println();
        }
    }
}
