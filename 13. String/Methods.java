import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Hwllo World This is Ashutosh Maurya";
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toLowerCase());

        System.out.println(name.toUpperCase());

        System.out.println(name.strip());
        
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
