import java.util.Arrays;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        int[] arr = new int[5];
        
        // array of prmitives
        arr[0] = 23;
        arr[1] = 2334;
        arr[2] = 23423;
        arr[3] = 235;
        arr[4] = 213;
        // System.out.println(arr[4]);


        // input using for loop
        for(int i=0; i<5; i++){
            // if know the array length
        }


        // Scanner in = new Scanner (System.in);        
        // for(int i=0; i<arr.length; i++){
        //     // if don't know the array length
        //     arr[i] = in.nextInt();
        // }

        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i] + " ");
        // }


        // // INHANCED LOOP
        // for(int num : arr) {        //num is reepresented as each element of an array.. 
        //     System.out.println(num);
        // }

        // System.out.println(Arrays.toString(arr));


        // Array of objects
        Scanner in = new Scanner (System.in);        
        String[] str = new String[4];
        for(int i=0; i<str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        // modify 
        str[3] ="maurya";
        System.out.println(Arrays.toString(str));
    }
}
