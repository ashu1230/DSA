import java.util.Scanner;

public class DisplayAllNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter Your Number: ");
            int n = sc.nextInt();

            if(n % 10 == 0){
                continue;
            }
            System.out.println("Number was: " + n);
        }
        while(true);
    }
}
