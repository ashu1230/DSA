import java.util.Scanner;

public class LargerValue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter for a");
        int a = sc.nextInt();
        System.out.println("enter for b");
        int b = sc.nextInt();
        if (a > b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
    }
}
