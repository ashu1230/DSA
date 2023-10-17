import java.util.Scanner;

public class IfElse{
    public static void main(String[] args) {
        // int age = 19;
        // if(age >= 18){
        //     System.out.println("you can vote");
        // }
        // else{
        //     System.out.println("you are not eligible for vote");
        // }



        // // user input....
        // Scanner  sc = new Scanner(System.in);
        // System.out.println("Enter your Age");
        // int age = sc.nextInt();
        // if (age >= 18) {
        //     System.out.println("Adult: You Are Eligble For Vote");
        // }
        // else {
        //     System.out.println("Not Adult .....");
        // }


        // multiple condition..
        // user input....
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Adult: You Are Eligble For Vote");
        }
        if (age > 13 && age < 18){
            System.out.println("Teenager");
        }
        else {
            System.out.println("Not Adult .....");
        }
    }
}