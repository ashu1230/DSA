
public class MaxIn2D {
    public static void main(String[] args) {
        int[][] arr = {
            {23, 43,56,43,89},
            {32,45,67,98,94},
            {46,7,92,34,23,-2}
        };

        System.out.println(max(arr));

        System.out.println(Integer.MAX_VALUE );
    }

    static int max (int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if(element > max){
                    max = element;
                }
            }
        }
        return max;
    }
}
