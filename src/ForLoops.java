public class ForLoops {

    public static String printingHashTags(int num_hashes) {
        String hashtag_print = "";

        for (int count = 0; count < num_hashes; count++) {
            hashtag_print += "#";
        }
        return hashtag_print;
    }


    public static String countDown(int start_num, int end_num) {
        String count_down_num = "";

        if (end_num >= start_num) {

            for (int count = end_num; count >= start_num; count--) {
                count_down_num += count + " ";

            }
        } else {
            return "";
        }

        return count_down_num;

    }


    public static String countDown2(int start_num, int end_num) {
        String count_down_num = "";

        if (start_num > end_num) {
            for (int count=start_num; count>= end_num;count--) {
                count_down_num += count + " ";
            }
        } else if (start_num < end_num) {
            for (int count = end_num; count >= start_num; count--) {
                count_down_num += count + " ";

            }
        } else {
            for (int count = start_num; count >= end_num; count--) {
                count_down_num += count + " ";
            }


        }

        return count_down_num +"";
    }

    public static int sumNumbers(int num1, int num2) {

        int total_numbers_num1 = 0;


        if (num1 >= num2) {
            for (int count = num1; count >= num2; --count) {
                total_numbers_num1 += count;
            }
        }

        else{
        for (int count2 = num2; count2 >= num1; --count2) {
            total_numbers_num1 += count2;
        }

        }

        return total_numbers_num1;
    }

    public static void main(String[] args) {

    }
}