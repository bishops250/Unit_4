import java.util.Scanner;

public class WhileLoops {

    static Scanner scan = new Scanner(System.in);


    public static String fromHereToThere(int num1, int num2) {
        String output = "";

        if (num1 > num2) {
            return "Invalid";
        } else
            while (num1 < num2) {
                ++num1;
                output += num1 + " ";

            }

        return output;
    }

    public static String factors(int num) {
        String total = "";
        int start_num = 1;
        while (start_num < (num+1) ) {

            if (num % start_num == 0) {
                total += start_num + " ";
            }
            start_num++;
        }

        return "The factors of " + num + " are: " + total;
    }

    public static String countPosAndNeg() {
        Scanner user_input = new Scanner(System.in);
        int positive_num = 0;
        int negative_num = 0;
        int num1 = 1;
        while (num1 != 0) {

            System.out.println("Enter a positive or negative number or 0 to quit: ");
            num1 = user_input.nextInt();

            if (num1 < 0) {
                negative_num++;
            }

            else if(num1>0) {
                positive_num++;
            }
        }

        return "There were " + positive_num + " positive and " + negative_num + " negative numbers. ";
    }

    public static String findMindAndMax() {
        Scanner user_input = new Scanner(System.in);
        int max_num = Integer.MAX_VALUE;
        int min_num = Integer.MIN_VALUE;
        int count_num = 0;


        while (count_num < 5) {
            System.out.println("Number:");
            int user_num = user_input.nextInt();

            if (user_num < max_num) {
                max_num = user_num;
            } else if (user_num > min_num) {
                min_num = user_num;
            }

            count_num++;
        }
        return "Max Value is: " + max_num + "\nMin Value is: " + min_num;
    }


    public static double gradePoint() {
        Scanner user_input = new Scanner(System.in);
        String user_letter;
        int count_num = 0;
        double grade_point_total = 0;
        double grade_point_average = 0;
        double final_gpa;


        while (count_num < 7) {

            System.out.println("Enter Seven Letter Grades: ");
            user_letter = user_input.nextLine().toLowerCase();

            if (user_letter.equals("a")) {
                grade_point_total += 4;
            } else if (user_letter.equals("b")) {
                grade_point_total += 3;

            } else if (user_letter.equals("c")) {
                grade_point_total += 2;
            } else if (user_letter.equals("d")) {
                grade_point_total += 1;
            } else if (user_letter.equals("f")) {
                grade_point_total += 0;
            }

            count_num++;
        }
        grade_point_average = grade_point_total / 7;

        final_gpa = ((int) ((grade_point_average * 100) + 0.5));

        return (final_gpa / 100);

    }

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Please enter an start number: ");
        int start_location = user_input.nextInt();

        System.out.println("Please enter an end number: ");
        int end_location = user_input.nextInt();

        System.out.println(fromHereToThere(start_location, end_location));

        System.out.println("Please enter a number you want to find the factor of:");

        int num = user_input.nextInt();
        System.out.println(factors(num));

        System.out.println(countPosAndNeg());

        System.out.println(findMindAndMax());

        System.out.println("GPA =" + gradePoint());

    }

}
