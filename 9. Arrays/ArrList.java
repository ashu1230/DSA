import java.util.ArrayList;
import java.util.Scanner;
public class ArrList {
    public static void main(String[] args) {
        // Syntax...
        ArrayList<Integer> list = new ArrayList<>(10);
        // list.add(324);
        // list.add(34);
        // list.add(54);
        // list.add(21);
        // list.add(43);
        // list.add(67);
        // list.add(90);
        // list.add(324);
        // list.add(34);
        // list.add(54);
        // list.add(21);
        // list.add(43);
        // list.add(67);
        // list.add(90);
        // list.add(324);
        // list.add(34);
        // list.add(54);
        // list.add(21);
        // list.add(43);
        // list.add(67);
        // list.add(90);

        // System.out.print(list + " ");
        // System.out.println(list.set(5, 343)+" ");
        // System.out.println(list.remove(5)+ " ");
        // System.out.println(list);

        // input
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list);

        // get item at any index...
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
        
    }
}
