public class StringCheck {

    public static String check(String str1) {
        int len = str1.length();
        char f = str1.charAt(0);
        char l = str1.charAt(len - 1);

        if ( f == 'x' || l == 'x' ) {
            return (str1.substring(1, len - 1));
        } else {
            return str1;
        }
    }

    public static void main(String[] args) {

        if (args.length > 1 || args.length < 1) {
            System.err.println("Provide correct number of arguments");
        } else {
            System.out.println(check(args[0]));
        }
    }

}
