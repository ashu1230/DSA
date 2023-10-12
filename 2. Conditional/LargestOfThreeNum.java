import java.util.Scanner;

public class LargestOfThreeNum {
    public static void main(String args[]) {
       
    // //   condition b is not working..
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt(); 
        // if (a >= b){
        //     System.out.println("a is greater");
        // }       
        // else if (a > b && b < c){
        //     System.out.println("b is greater");
        // }
        // else{
        //     System.out.println("c is greater");
        // }




        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt(); 
        if ((a >= b) && (a >= c)){
            System.out.println("a is greater");
        }       
        else if (b >= c){
            System.out.println("b is greater");
        }
        else{
            System.out.println("c is greater");
        }
    }
}
