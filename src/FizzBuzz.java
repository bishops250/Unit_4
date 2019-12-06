import javax.swing.*;
import java.util.Scanner;
public class FizzBuzz {

    public static String fizzBuzz(int num) {

        String fizzBuzz_print = "";

        for (int count2 = 1; count2 <= num; ++count2) {

            if (count2 % 5 == 0 && count2 % 3 == 0) {
                fizzBuzz_print += "FizzBuzz ";

            }
            else if (count2 % 3 == 0 && count2 % 5 != 0) {
                fizzBuzz_print += "Fizz ";
            }
            else if (count2 % 5 == 0 && count2 % 3 != 0) {
                fizzBuzz_print += "Buzz ";
            }
            else if (count2 % 3 != 0 && count2 % 5 != 0) {
                fizzBuzz_print += count2 + " ";

            }
            if (count2 % 20 == 0) {
                fizzBuzz_print += "\n";
        }


    }
        return fizzBuzz_print;
    }

    public static void main(String[]args) {

        Scanner user_input = new Scanner(System.in);
        System.out.println("Max value? ");
        int fizzbuzz_num= user_input.nextInt();
        System.out.println(fizzBuzz(fizzbuzz_num));
    }
}
