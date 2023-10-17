public class SmallestNumber {
    public static int smalnumber(int num[]){  
        int smallest = Integer.MAX_VALUE;
        for (int i=0; i<num.length; i++){
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,9,7,0,1};
        System.out.println("largest value is : " + smalnumber(num));    
    }   
}
