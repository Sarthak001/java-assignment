public class Stringpalindrome {

    public static boolean palindromechecker(String str) {
        int len = str.length();
        char[] arr = str.toCharArray();
        String r_str = "";

        for (int i = len - 1; i >= 0; --i) {
            r_str += arr[i];

        }
        if (str.equals(r_str)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        if (args.length > 1) {
            System.err.println("Only one argument was required but more were given");
        } else {
            String str = "";
            str = args[0];
            if (palindromechecker(str)) {
                System.out.println("The given string is a palindrome");
            } else {
                System.out.println("The given string is not a palindrome");
            }
        }

    }
}