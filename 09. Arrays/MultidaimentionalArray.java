
import java.util.Arrays;
import java.util.Scanner;

public class MultidaimentionalArray {
    public static void main(String[] args) {
        // int[][] twoDArr = new int[3][];

        // hard codded..
        int [][] arr2D = {
            {1,2,3,4},
            {2,9,3,4,5,5},
            {2,3,4,5,6}
        };

        // input in 2D arrays

        Scanner in = new Scanner(System.in); 
        int[][] arr = new int[3][3];

        System.out.println(arr.length);     //give no. of rows

        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            } 
        }

        // // Output-1 
        // for (int row = 0; row < arr.length; row++) {
        //     //for each col in every row
        //     for (int col = 0; col < arr[row].length; col++) {
        //         System.out.print(arr[row][col] + " ");
        //     } 
        //     System.out.println();
        // }

        // // Output-2
        // for (int row = 0; row < arr.length; row++) {
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        // inhanced for loop
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
