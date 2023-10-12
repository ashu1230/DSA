package Strings;

public class SkipString {
    public static void main(String[] args) {
        System.out.println(skipApple("appleahsappajhsbajdsalkdapplesaljkkjdfapplea;laasapple;lkfk;"));
        // removed all a in this string..
    }

    static String skipApple(String up){
        // p -- process,    up---unprocess
        if(up.isEmpty()){
            return "";
        }


        if(up.startsWith("apple")) {
            return "_" + skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    static String skipAppNotApple(String up){
        // p -- process,    up---unprocess
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")) {
            return "_" + skipApple(up.substring(3));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
}
