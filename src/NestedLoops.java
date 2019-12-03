public class NestedLoops {


    public static String xSquare() {

        String print_square= "";

        for(int count=1; count<=5; count++) {
            for(int count2=1; count2<=5; count2++) {
                print_square += "X";
            }
            print_square += "\n";
        }

        return print_square;
    }
    public static String xSquare2(int rec_width_X_length) {

        String printed_square= "";

        for(int count= 0; count<rec_width_X_length; count++) {
            for(int count2= 0; count2<rec_width_X_length;count++) {
                printed_square += "X";
            }
            printed_square += "\n";
        }

        return printed_square;
    }
    public static String flippedTriangle(int n) {

        return "";
    }

    public static String multiplicationTable() {

        return "";
    }


    public static void main(String[]args) {

       //System.out.println(xSquare());
       System.out.println(xSquare2(8));
    }
}