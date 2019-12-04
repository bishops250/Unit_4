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

        for(int count = 1; count<=rec_width_X_length; ++count) {
            for(int count2= 1; count2<rec_width_X_length;++count2){
                printed_square += "X";
            }
            printed_square += "\n";
        }

        return printed_square;
    }
    public static String flippedTriangle(int start_num) {

        String printed_flipped_triangle = "";

        for(int count = start_num; count>=1; --count) {
            for(int count2=count;count2>=1;--count2) {
                printed_flipped_triangle += "*";
            }
            printed_flipped_triangle += "\n";
        }

        return printed_flipped_triangle;
    }

    public static String multiplicationTable() {

        String multiplicationtable= "";

        for(int count=1; count<= 9;count++) {
            for(int count2= 1; count2<=9; count2++) {
                if(count * count2<10) {
                    multiplicationtable+= "  " + count*count2;
                }
                else {
                    multiplicationtable+= " " + count*count2;
                }
            }
            multiplicationtable +=  "\n" ;
        }
        return multiplicationtable;
    }


    public static void main(String[]args) {

       //System.out.println(xSquare());
      //System.out.println(xSquare2(4));
      //System.out.println(flippedTriangle(6));
        System.out.println(multiplicationTable());
    }
}