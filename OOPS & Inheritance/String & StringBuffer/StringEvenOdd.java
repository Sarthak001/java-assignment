public class StringEvenOdd {

    public static String evenodd(String str1) {
        int len = str1.length();
        if (len % 2 == 0) {
            int mid = len / 2;
            String res_str = "";
            char[] arr = str1.toCharArray();
            for (int i = 0; i <= mid - 1; ++i) {
                res_str += arr[i];
            }
            return res_str;

        } else {
            return null;
        }

    }

    public static void main(String[] args) {
        if (args.length > 1 || args.length < 1) {
            System.err.println("Provide correct number of arguments");
        } else {
            String res_str;
            res_str = evenodd(args[0]);
            System.out.println(res_str);
        }

    }

}
