public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        int[] arr = {-15, -12,-2 ,-1,2,3,4,5,6,7,8,9,12,23,43,55,67,78,98};
        int target = 55;
        int ans = cileing(arr, target);
        System.out.println(ans);
    }

    // return the index .
    // return -1 if it dose not exist..
    static int cileing(int[] arr, int target) {
 
        if(target < arr[arr.length-1]){
            return -1;
        }
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
        return start;
    }
}