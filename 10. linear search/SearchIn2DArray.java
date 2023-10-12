import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {23, 43,56,43,89},
            {32,45,67,98,94},
            {46,7,92,34,23,-2}
        };

        int target = 43;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search (int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
