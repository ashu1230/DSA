public class HalfPiramidInNum {


    public static void half_piramid_num(int n) {
        for (int i=1; i<=n; i++){
            for (int j=1; j <= n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        half_piramid_num(5);
    }
}
