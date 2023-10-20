
import java.util.Map.*;       //Map.of method with multiple arguments. This method was introduced in Java 9.
import java.util.TreeMap;

public class TreeMapCollection {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(7,"R");
        tm.put(9, "H");

        Entry<Integer, String> e = tm.firstEntry();
        System.out.println(e.getKey()+ " "+e.getValue());

        System.out.println(tm.ceilingEntry(5).getValue());

        System.out.println(tm.get(6));

        System.out.println(tm);
    }
}
