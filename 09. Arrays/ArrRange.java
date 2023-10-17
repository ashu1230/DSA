public class ArrRange {
    public static void main(String[] args) {
        int[] arr = {23,3,45,75,23};
        
        System.out.println(maxRange(arr, 0, 3));
    }

    // imagine the array is not empty...
    static int maxRange(int[] arr, int start, int end){
        int maxVal = arr[start];
         for (int i = 1; i < end; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
         }
         return maxVal;
    }
}
