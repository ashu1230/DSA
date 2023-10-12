import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1231, -234, -21, 0, 1,54, 45,78};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swapped;
        // run the steps n-1 times.
        for(int i=0; i<arr.length; i++){ 
            swapped = false;
            // for each steps max items will comes at the last recpective index
            for(int j=1; j<arr.length-i; j++) {
                // Swap if the item is smaller than the privious item.
                if(arr[j] < arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
