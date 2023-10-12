import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,63,30,7,-7,-8,-67,-655,-454};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break; 
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
