public class Pattern8 {
    public static void main(String[] args) {
        pattern(5);
    }

//         1 
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            // for every row, run the col..

            for (int space = 0; space < n-i; space++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            } 
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            // when one row is printed, we need to add a newline...
            System.out.println();
        }
    }
}

