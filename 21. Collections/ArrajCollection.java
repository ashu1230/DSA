import java.util.Arrays;

public class ArrajCollection {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,4,5,4,7};
        int b[] = {0,2,3,4,5,6,7,4,5,8,7};

       

        System.out.println( Arrays.mismatch(a, b) );
        System.out.println( Arrays.compare(a, b) );  // return 0-> arr same,      return 1-> arr not same
    }
}
