// import java.util.List;
// import java.util.TreeSet;
import java.util.*;

public class TreeSetCollections {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(54,45,54,34,54));

        ts.add(409);
        ts.add(89);
        ts.add(79);
        ts.add(79);
        ts.add(39);
        ts.add(69);
        ts.add(59);
        System.out.println(ts.descendingSet());
        System.out.println(ts.hashCode());
        System.out.println(ts.first());

        System.out.println(ts);
    }
}
