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
        for(int count =0; count < word_length; count += 2) {
            skip_letter += user_word.substring(count,count+1);

        }

        return skip_letter;
    }

    public static int countTheVowels(String user_word) {
        int word_vowels = 0;
        for(int count= 0; count<user_word.length();++count) {
            String current_word_letter = user_word.substring(count, count + 1);
            if(current_word_letter.toLowerCase().equals("a") || current_word_letter.toLowerCase().equals("e") ||
                    current_word_letter.toLowerCase().equals("i") || current_word_letter.toLowerCase().equals("o") ||
                    current_word_letter.toLowerCase().equals("u")) {
                word_vowels ++;
            }
        }
        return word_vowels;
    }

    public static String differentStrings(String user_word1, String user_word2) {

        int difference_letter=1;
        String testing_word1= "";
        String testing_word2= "";

        if(user_word1.toLowerCase().equals(user_word2.toLowerCase())) {
            return user_word1 + " and " + user_word2 + " are the same";
        }

        else

            for(int count = 0; count != user_word1.length() && count != user_word2.length();count++) {
                 testing_word1 +=user_word1.toLowerCase().substring(count,count+1);
                 testing_word2 +=user_word2.toLowerCase().substring(count,count+1);

                if (testing_word1.equals(testing_word2)) {
                     difference_letter = (count + 1)+1 ;
                }

            }

        return user_word1 + " and " + user_word2 + " are not the same. They differ at letter number " +
                difference_letter ;
    }

    public static boolean isPalindrome(String user_word) {

        boolean palindrome_bool;

        String reverse_word= "";

        String first_user_word= "" +user_word.toLowerCase();

        for(int count= user_word.length(); count> 0; count-- ) {
            reverse_word +=first_user_word.substring(count-1,count);
        }
        if(reverse_word.equals(first_user_word.toLowerCase())) {
            palindrome_bool= true;
        }
        else {
            palindrome_bool = false;
        }
        return palindrome_bool;
    }



    public static void main(String[]args) {

    }
}
