package Conditional;

import java.util.Scanner;

public class Ashu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The in 1 To 3: ");
        int num = sc.nextInt(); 
        switch (num){
            case 1 : System.out.println("veg");
            break;
            case 2 : System.out.println("non veg");
            break;
            case 3 : System.out.println("vigan");
            break; 
        }
    }
}
