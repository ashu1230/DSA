import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapCollection{
    public static void main(String[] args){
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(2, .75f, true){
            protected boolean removeElement(Map.Entry e){
                //Map.of method with multiple arguments. This method was introduced in Java 9.
                return size() > 5;
            }
        }

        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(4, "D");
        lhm.put(5, "E");
        lhm.put(6, "F");
        lhm.put(5, "D");

        String s = lhm.get(2);
        s = lhm.get(5);
        s = lhm.get(1);

        lhm.forEach((k, v) -> System.out.println(k+" "+v));
    }
}