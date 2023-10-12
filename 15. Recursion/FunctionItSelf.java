public class FunctionItSelf {
    public static void main(String[] args) {
        // WAF that takes in a number and prints it;...
        print(1);
    }

    static void print(int n){
        
        if(n==5){
            System.out.println(5);
            return;
        }
        
        System.out.println(n);
        print(n+1);

    }
}
