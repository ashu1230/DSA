import java.util.ArrayList;
import java.lang.Integer;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); 
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1 );  
        // This is same as after a few steps: "a" + "1";
        // integer will be convrted ti integer that will call toString();

        System.out.println("Ashutosh" + new ArrayList<>());

        System.out.println("Ashutosh" + 88);

        System.out.println(87 + "" + new ArrayList<>());

        
    }
}
