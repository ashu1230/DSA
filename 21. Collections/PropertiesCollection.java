import java.io.FileOutputStream;
import java.util.*;

public class PropertiesCollection {
    public static void main(String[] args) {
        Properties p = new Properties();

        p.setProperty("laptop", "dell");
        p.setProperty("ram", "8gb");
        p.setProperty("processor", "i3");
        p.setProperty("ssd", "1TB");

        p.store(new FileOutputStream("filename"), "Laptop");
    }
}
