import java.util.*;
public class LargestNumbers {
    
    public static int larnumber(int num[]){
        int largest = Integer.MIN_VALUE;   // -infinty (MIN_VALUE)
        for (int i=0; i<num.length; i++){
            if (largest < num[i]){
                largest = num[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,9,7,0,1};
        System.out.println("largest value is : " + larnumber(num));    
    }
}
