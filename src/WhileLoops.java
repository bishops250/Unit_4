
import java.util.Scanner;

public class WhileLoops {

    static Scanner scan = new Scanner(System.in);

    public static String testing_method() {
    }

    public static String fromHereToThere(int num1, int num2) {
String output= "";

        if (num1>num2) {
            return "Invalid";
        }
        else
            while(num1<num2) {
                ++num1;
                 output += num1 + "";

        }

        return output;
    }

    public static String factors(int num) {
        String output="";
        int start_num=0;
        while(start_num<num) {
            start_num++;
            output += num % start_num;
        }

        return output;
    }

    public static String countPosAndNeg(int num1, int num2) {

    }

    public static String findMinAndMax(int num1, int num2) {
    }


    public static String gradePoint(int num1, int num2) {
    }

}
public static void main(String[]args) {




        }
    }

}