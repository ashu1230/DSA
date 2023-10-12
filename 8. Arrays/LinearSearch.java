public class LinearSearch {

    public static int linearSearch(int num[], int key) {
        
        for (int i=0; i<num.length; i++){
            if (num[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {2,4,8,6,5,6,7};
        int key = 2;

        int index = linearSearch(num, key);

        if (index == -1){
            System.out.println("not found");
        }
        else {
            System.out.println("Key is at index :" + index);
        }
    }
}
