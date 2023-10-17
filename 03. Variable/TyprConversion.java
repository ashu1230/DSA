
public class TyprConversion {
    public static void main(String[] args) {
        // int a = 34;
        // float b = a;
        // System.out.println(b);

        // int a = 34;
        // long b = a;
        // System.out.println(b);


        // // not possible..
        // long a = 34;
        // int b = a;
        // System.out.println(b);


        // // implicit conversion..
        // Scanner sc = new Scanner(System.in);
        // float num = sc.nextInt();
        // System.out.println(num);


        // // possible..
        // // we convet forsefully - it is called type casting....
        // long a = 34;
        // int b = (int) a;
        // System.out.println(b);



        // char ch = 'e';
        // int num = ch;
        // System.out.println(num);


        // char a = 'a';
        // char b = 'b';
        // System.out.println((int)(a));
        // System.out.println((int)(b));
        // System.out.println(b-a);



        int a=10;
        long b=24;
        float c=23.34f;
        double d=34;
        double ans = (double) a+b+c+d;
        System.out.println(ans);


    }
}
