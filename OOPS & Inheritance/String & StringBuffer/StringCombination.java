public class StringCombination {
    public static String combine(String str1, String str2) {
        String res_str = "";
        int len_str1 = str1.length();
        int len_str2 = str2.length();

        if (len_str1 > len_str2) {

            for (int z = 0; z <= len_str2 - 1; ++z) {
                res_str += "" + str1.charAt(z) + str2.charAt(z);
            }
            res_str += str1.substring(len_str2, len_str1);

        } else if (len_str1 < len_str2) {


            for (int z = 0; z <= len_str1 - 1; ++z) {
                res_str += "" + str1.charAt(z) + str2.charAt(z);
            }
            res_str += str2.substring(len_str1,len_str2);

        } else {

            for (int z = 0; z <= len_str1 - 1; ++z) {
                res_str += "" + str1.charAt(z) + str2.charAt(z);
            }

        }

        return res_str;

    }

    public static void main(String[] args) {
        if (args.length > 2 || args.length < 2) {
            System.err.println("invalid arguments");
        } else {
            System.out.println(combine(args[0], args[1]));
        }
    }
}
