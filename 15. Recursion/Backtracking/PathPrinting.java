import java.util.ArrayList;

public class PathPrinting {
    public static void main(String[] args){ 
        path("", 3, 3);
        System.out.println("With Array List:-" + pathRet("", 3, 3));
    }

    static void path(String p, int r, int c){
        if(r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if(r>1){
            path(p+'D', r-1, c);
        }

        if(c>1){
            path(p+'R', r, c-1);
        }
    }

    // return array list..
    static ArrayList<String> pathRet(String p, int r, int c){
        if(r == 1 && c == 1) {
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(pathRet(p+'D', r-1, c));
        }

        if(c>1){
            list.addAll(pathRet(p+'R', r, c-1));
        }
        return list;
    }
}
