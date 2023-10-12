import java.util.Arrays;

public class SearchInStrings {
    
    public static void main(String[] args) {
        String name = "Ashutosh";
        char target = 'A';

        // for check the one elemnt in the given string...
        System.out.println(Search(name, target));

        // for print the character of the array...
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    // function for print the character of the array...
    static boolean Search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

    // To check the character of the array...
    static boolean Search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
