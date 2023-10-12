package Strings;

public class ReturningString {
    public static void main(String[] args) {
        System.out.println(skip("ahsajhsbajdsalkdsaljkkjdfa;laas;lkfk;"));
        // removed all a in this string..
    }

    static String skip(String up){
        // p -- process,    up---unprocess
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a') {
            return skip(up.substring(1));
        } else {
            return ch + skip(up.substring(1));
        }
    }
}
