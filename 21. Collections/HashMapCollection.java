import java.util.*;

public class HashMapCollection {
    public static void main(String[] args) {
        HashMap<Integer, String> tm = new HashMap<>(Map.of(1, "A", 2, "B", 3, "C", 4, "D", 5, "E"));

        tm.put(7, "R");
        tm.put(9, "H");



        System.out.println(tm);
    }
}
