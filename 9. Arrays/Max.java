public class Max {
    public static void main(String[] args) {
        int[] arr = {23,3,45,75,23};
        
        System.out.println(max(arr));
    }

    // imagine the array is not empty...
    static int max(int[] arr){
        int maxVal = arr[0];
         for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
         }
         return maxVal;
    }
}
