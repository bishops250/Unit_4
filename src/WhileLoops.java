
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
                 output += num1 + " ";

        }

        return output;
    }

    public static String factors(int num) {
        String total="";
        int start_num=0;
        while(start_num<=num) {
            if(start_num%num ==0)
            total += num +"";
            start_num++;
        }

        return total;
    }

    public static String countPosAndNeg() {
        Scanner user_input = new Scanner(System.in);
        int positive_num= 0;
        int negative_num=0;
        System.out.println("Enter a positive or negative number or 0 to quit: ");
        int num1=user_input.nextInt();


        while(num1 !=0) {

            if(num1 <0) {
            negative_num ++;
            }
            else {
                positive_num++;
            }

            System.out.println("Enter a positive or negative number or 0 to quit: ");
            num1=user_input.nextInt();

        }
        return "There were " + positive_num + " positive and " + negative_num + " negative numbers.";
    }

    public static String findMinAndMax(int num1) {
        int count_num=0;
        while (count_num<5){
            System.out.println("Number");
        }
return "";
    }


    public static String gradePoint(int num1, int num2) {
        Scanner user_input = new Scanner(System.in);
        int count_num=0;
        double grade_point_average=0;

        System.out.println("Enter Seven Letter Grades: ");
        while(count_num<7)

            grade_point_average+=0;



   return "GPA = " + grade_point_average;

    }
public static void main(String[]args) {

System.out.println(fromHereToThere(20,30));



        }
    }
