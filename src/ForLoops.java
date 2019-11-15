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

        if (start_num <= end_num) {

            for (int count = start_num; count < end_num; count++) {
                count_down_num += end_num + " ";
                end_num--;
            }
        } else {
            return "";
        }
        return count_down_num;

    }


    public static String countDown2(int start_num, int end_num) {
        String count_down_num = "";
        if (start_num > end_num) {
            for (int count = end_num; count < start_num; count++) {
                count_down_num += start_num + "";
                end_num--;
            }
        } else if (start_num < end_num) {
            for (int count = start_num; count < end_num; count++) {
                count_down_num += end_num + "";
                end_num--;
            }
        } else {
            for (int count = start_num; count < end_num; count++) {
                count_down_num += end_num + "";
                end_num--;
            }


        }

        return count_down_num;
    }

    public static String sumNumbers(int num1, int num2) {

        int total_numbers_num1 = 0;
        int total_numbers_num2 = 0;

        for (int count = 0; count <= num1; --num1) {
            total_numbers_num1 += num1;
        }

        for (int count2 = 0; count2 <= num2; --num2) {
            total_numbers_num2 += num2;

        }

        return "" + total_numbers_num1+total_numbers_num2;
    }

    public static void main(String[] args) {

    }
}
