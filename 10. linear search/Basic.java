public class Basic {
    public static void main(String[] args) {
        
        int[] nums = {23,34,67,-4,45,6,-5,23,78,6,8,98};
        int target = -34;
        int ans = linearSearch(nums, target);
        System.out.println("Total Array Length " + nums.length);
        System.out.println("Index: " + ans + " " + target + " Found");
        System.out.println("If Print -1 Then it means element is not exist");
    }

    // Search the target and return true or false....
    static boolean linearSearch3(int[] arr, int target) {
        // Search in the array :  return the index if item found 
        //othewise item not found return -1;
        if (arr.length==0){
            return false;
        }

        // run a for loop
        for (int element : arr) {
        	if (element==target) {
        		return true;
        	}
			
        }
        
        // this line will execute if none of the return statements above have executed 
        //hence tha target not found...
        return false; 

    }



    // Search the target and return the index of search element....
    static int linearSearch2(int[] arr, int target) {
        // Search in the array :  return the index if item found 
        //othewise item not found return -1;
        if (arr.length==0){
            return -1;
        }

        // run a for loop
        for (int element : arr) {
        	if (element==target) {
        		return element;
        	}
			
        }
        
        // this line will execute if none of the return statements above have executed 
        //hence tha target not found...
        return Integer.MAX_VALUE; 

    }

    // Search the target and return the index of search element....
    static int linearSearch(int[] arr, int target) {
        // Search in the array :  return the index if item found 
        //othewise item not found return -1;
        if (arr.length==0){
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
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