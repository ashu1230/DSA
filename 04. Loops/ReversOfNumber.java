import java.util.Scanner;

public class ReversOfNumber {
    public static void main(String[] args) {
        // int n = 69;
        // while(n > 0){
        //     int lastdigit = n % 10;
        //     System.out.print(lastdigit);
        //     n = n / 10;
        // }
        // System.out.println();



        // using user input...
        Scanner sc = new Scanner(System.in);
        int inputnum = sc.nextInt();
        while(inputnum > 0){
            int last = inputnum % 10;
            System.out.print(last);
            inputnum = inputnum / 10;
        }
        System.out.println();
    }
}
