import java.util.Scanner;

public class PassFail {
    public static void main(String args[]) {
        // Scanner sc = new Scanner (System.in);
        // int Marks = sc.nextInt();
        // if(Marks >=33){
        //     System.out.println("Pass");
        // }       
        // else {
        //     System.out.println("Fail");
        // }


        // using ternary operator...
        Scanner sc = new Scanner (System.in);
        int Marks = sc.nextInt();
        String Result = (Marks >= 33) ? "pass" :"fail";
        System.out.println("Your Are: " + Result);
    }
}
