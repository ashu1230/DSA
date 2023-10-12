public class Array {

    public static void update(int marks[]) {
        for (int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    
    public static void main(String[] args) {
        // Creating of an arrays..
        // int marks[] = new int[20];

        int marks[] = {90,98,99,97};
        // int moreNumbers[] = {99,98,99};  
        // String color[] = {"red", "green", "blue"};
        update(marks);
        
        // print our marks..
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
