import java.util.Arrays;

public class SortedMatix {
    public static void main(String[] args) {
        int[][] arr ={ 
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println(Arrays.toString(search(arr, 90)));
    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart >= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if(matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if(matrix[row][mid] < target) {
                cStart = mid+1;
            } else {
                cEnd = mid-1;

            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1) {
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        // run the loop till 2 rows are remailing
        while(rStart < (rEnd - 1)){
            int mid = rStart + (rEnd - rStart) / 2;
            if(matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if(matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
        // now we have two rows
        // check whether the target is in the col of 2 rows..
        if (matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target){
            return new int[]{rStart + 1, cMid};
        }

        // Search in 1st half
        if(target <= matrix[rStart][cMid - 1]){
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        // Search in 2st half
        if(target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]){
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // Search in 3st half
        if(target <= matrix[rStart + 1][cMid - 1]){
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        } else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
        
    }
}
