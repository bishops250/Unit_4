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
            skip_letter += user_word.substring(count,count+1)+"\n";

        }

        return skip_letter;
    }

    public static int countTheVowels(String user_word) {
        int word_vowels = 0;
        for(int count= 0; count<user_word.length();++count) {
            String current_word_letter = user_word.substring(count, count + 1);
            if(user_word.toLowerCase().equals("a") || user_word.toLowerCase().equals("e") ||
                    user_word.toLowerCase().equals("i") || user_word.toLowerCase().equals("o") ||
                    user_word.toLowerCase().equals("u")) {
                word_vowels ++;
            }
        }
        return word_vowels;
    }

    public static String differentStrings(String user_word1, String user_word2) {
 int difference_letter=0;
        if(user_word1.equals(user_word2)) {
            return user_word1 + " and " + user_word2 + " are the same";
        }

        else

            for(int count = 0; count != user_word1.length() && count != user_word2.length();count++) {
                String testing_word1=user_word1.substring(count,count+1);
                String testing_word2=user_word2.substring(count,count+2);
                if (testing_word1.equals(testing_word2)) {
                     difference_letter = (count + 1) + 1;
                }
            }

        return user_word1 + " and " + user_word2 + " are not the same. They differ at letter number" +
                difference_letter ;
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
