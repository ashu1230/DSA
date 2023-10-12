public class Floar {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = flor(arr, target);
        System.out.println(ans);
    }

    // return the index .
    // return -1 if it dose not exist..
    static  int flor(int[] arr, int target) {
        int start =0;
        int end = arr.length -1;

        while(start <= end) {
            // find the middle element..
            // int mid = (start + end) / 2;   //might be posible that (start + end ) exceeds the range of integer in java....
            
            int mid = start + (end -start) / 2;

            if (target < arr[mid]){
                end = mid-1;
            } else if(target > arr[mid]){
                start = mid+1;
            }else{
                // answer found
                return mid;
            }
        }
        return end;
    }
}