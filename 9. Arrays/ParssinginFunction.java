import java.util.Arrays;

public class ParssinginFunction {
    public static void main(String[] args) {
        int[] arr = {2, 34, 43, 45, 56};
        swap(arr, 0, 4);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
}
