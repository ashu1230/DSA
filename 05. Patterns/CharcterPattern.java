public class CharcterPattern {
    public static void main(String[] args) {
        char ch = 'A';
        for(int i=1; i<=5; i++){
            for(int c=1; c<=i; c++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
