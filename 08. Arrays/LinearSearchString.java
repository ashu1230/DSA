public class LinearSearchString {

    private static String red;
    public static int linearSearch(String[] menu, String key) {
        
        for (int i=0; i<menu.length; i++){
            if (menu[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String[] menu = {"yello", "blue", "red", "black"};
        String key = red;

        int index = linearSearch(menu, key);

        if (index == -1){
            System.out.println("not found");
        }
        else {
            System.out.println("Key is at index :" + index);
        }
    }
}
