public class StringLongShort {

    public static String longshort(String str1, String str2) {
        int str1_len = str1.length();
        int str2_len = str2.length();

        if (str1_len > str2_len) {
            return (str2 + str1 + str2);
        } else {
            return (str1 + str2 + str1);
        }

    }

    public static void main(String[] args) {

        if (args.length > 2 || args.length < 2) {
            System.err.println("Provide valid arguments");
        } else {
            System.out.println(longshort(args[0], args[1]));
        }

    }
}
