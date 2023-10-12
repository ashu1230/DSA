import java.util.Scanner;

public class ElseIf{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age >= 18){
            System.out.println("Adult: You are eligible for vote, drive");
        }
        else if (age >= 13 && age < 18){
            System.out.println("You are teenager");
        }
        else {
            System.out.println("Child");
        }
    }
}