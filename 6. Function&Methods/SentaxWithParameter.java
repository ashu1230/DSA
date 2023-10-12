import java.util.Scanner;

// public class SentexWithParameter {
//     public static void addition(int a, int b) {
//         int sum = a+b;
//         System.out.println("Sum is : " + sum);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         addition(a, b);
//     }
// }



// public class SentexWithParameter {
//     public static int addition(int a, int b) {
//         int sum = a+b;
//         return sum;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum =addition(a, b);
//         System.out.println("Sum is : " + sum);
//     }
// }



public class SentaxWithParameter {
    public static int addition(int num1, int num2) {
        // num1 and num2 are called formal parameters or parameters....
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum =addition(a, b);
        // a and b are called arguments or actual parameters......
        System.out.println("Sum is : " + sum);
    }
}
