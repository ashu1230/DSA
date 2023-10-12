class Reverse{
    
    static int sum = 0;
    static void revi(int n){
        if(n==0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 +rem;
        revi(n/10);
    }

    static boolean rev2(int n) {
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits){ 
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return  rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits);
    }

    static boolean palindrome (int n){
        return n == revi(n);
    }


    public static void main(String[] args) {
        revi(124567856);
        System.out.println(sum);
        System.out.println(rev2(123456789));
    }

}