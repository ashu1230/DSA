public class FindMin {
    public static void main(String[] args) {
        int[] arr = {89, 45, 1, 56, 43, 23, 34, 89, -22};
        System.out.println(minNumber(arr)); 
    }

    // assume arr.length != 0;
    // return the minimum value in the array   
    static int minNumber(int[] arr){
        int ans = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
