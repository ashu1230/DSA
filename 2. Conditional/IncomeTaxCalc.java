import java.util.Scanner;

public class IncomeTaxCalc {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // float income = sc.nextFloat();
        // float tax = sc.nextFloat();
        // if (income > 10){
        //     System.out.println("30% tax applicable");
        // }
        // else if (income >= 5 && income < 10){
        //     System.out.println("20% tax applicable");
        // }
        // else {
        //     System.out.println("no tax is applicable");
        // }



        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax ;
        if (income <= 500000){
            tax = 0;
        }
        else if (income >= 500000 && income < 1000000){
            tax = (int) (income * 0.2);
        }
        else {
            tax = (int) (income * 0.3);
        }
        System.out.println("Your Tax Is " + tax);
    }
}
