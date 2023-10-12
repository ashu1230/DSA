public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {23, 45, 56,43,-23 ,34,89,-22};
        int target = 89;
        int start = 1;
        int end = 5;
        System.out.println(target + " at index " + linearSearch(arr, target, start, end));
    }

    // Search the target and return the index of search element....
    static int linearSearch(int[] arr, int target, int start, int end) {
        // Search in the array :  return the index if item found 
        //othewise item not found return -1;
        if (arr.length==0){
            return -1;
        }

        // run a for loop
        for (int index = start; index <= end; index++) {
            // check for element at every index if it is  = target
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }

        // this line will execute if none of the return statements above have executed 
        //hence tha target not found...
        return -1; 

    }
}
