public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr = {-15, -12,-2 ,-1,2,3,4,5,6,7,8,9,12,23,43,55,67,78,98};      //assending order array...

        // now apply decending order array....
        int[] arr = {99,98,78,67,56,54,43,23,21,11,3,2,1,0};
        int target = 21;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start =0;
        int end = arr.length -1;
        // find whether the array is sorted in assending or decending
        boolean isAsc = arr[start] < arr[end];

        //same think...
        // if(arr[start] < arr[end]) {
        //     isAsc = true;
        // }
        // else {
        //     isAsc = false;
        // }


        while(start <= end) {
            // find the middle element..
            // int mid = (start + end) / 2;   //might be posible that (start + end ) exceeds the range of integer in java....
            
            int mid = start + (end -start) / 2;

            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc){
                  if (target < arr[mid]){
                end = mid-1;
            } else{
                start = mid+1;
            }
            }

            else{
                if (target > arr[mid]){
                    end = mid-1;
                } else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
