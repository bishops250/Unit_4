import java.util.Scanner;

public class StringProblems {

    public static String printTheLetters(String user_word) {
        String space_word= "";
        int word_length= user_word.length();
        for(int count =0; count < word_length;count++) {
             space_word += user_word.substring(count,count+1)+"\n";

        }

        return space_word;
    }

    public static String everyOtherLetter(String user_word) {
        String skip_letter= "";
        int word_length= user_word.length();
        for(int count =0; count < word_length;count++) {
            skip_letter += user_word.substring(count,count+1)+"\n";

        }

        return skip_letter;
    }

    public static int countTheVowels(String user_word) {

        return 0;
    }

    public static String differentStrings(String s1, String s2) {

        return "";
    }

    public static boolean isPalindrome(String s) {

        return false;
    }



    public static void main(String[]args) {
        Scanner user_input = new Scanner(System.in);

        String user_word= user_input.next();

        //System.out.println(printTheLetters(user_word));
        System.out.println(everyOtherLetter(user_word));

    }
}
