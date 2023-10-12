public class BlockScope {
    public static void main(String[] args) {
        int n = 0;
        {
            int s = 10;
            System.out.println(n);
        }
        // System.out.println(s);      //it can not be print becoause of function the function scope...
        System.out.println(n);
    }
}
