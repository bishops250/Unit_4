
import java.util.Scanner;

public class WhileLoops {

    static Scanner scan = new Scanner(System.in);

    public static String testing_method() {
        return "";
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

    public static String countPosAndNeg() {
        Scanner user_input = new Scanner(System.in);
        int positive_num= 0;
        int negative_num=0;
        System.out.println("Enter a positive or negative number or 0 to quit: ");
        int num1=user_input.nextInt();


        while(num1 !=0) {
            System.out.println("Enter a positive or negative number or 0 to quit: ");
            num1=user_input.nextInt();

            if(num1 <0) {
            positive_num ++;
            }
            else {
                negative_num++;
            }
        }
        return "There were " + positive_num + " positive and " + negative_num + " negative numbers.";
    }

    public static String findMinAndMax(int num1) {
return "";
    }


    public static String gradePoint(int num1, int num2) {
   return "";

    }
public static void main(String[]args) {
countPosAndNeg();



        }
    }
