public class ConcatenateStrings {

    public static String concatenation(String str1, String str2) {
        if (str1.equals(str2)) {
            return str1;

        } else {
            return (str1.concat(str2));
        }
    }

    public static void main(String[] args) {

        if (args.length > 2 || args.length < 2) {
            System.err.println("Arguments not up to the mark");
        } else {
            String res;
            res = concatenation(args[0], args[1]);
            System.out.println(res);
        }

    }
}
