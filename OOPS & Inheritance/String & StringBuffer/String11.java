import java.util.Scanner;
public class String11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        String outStr = "";
        scan.close();

        while (str1.indexOf(str2) != -1) {
            int index = str1.indexOf(str2);

            if (index == 0 && index + str2.length() < str1.length() - 1) {
                outStr += (str1.charAt(index + str2.length()));
                str1 = str1.replaceFirst(str2, "");
                continue;
            }

            if (index - 1 >= 0 && index + str2.length() >= str1.length()) {
                outStr += (str1.charAt(index - 1));
                str1 = str1.replaceFirst(str2, "");
                continue;
            }

            if (index + str2.length() < str1.length() - 1 && index - 1 >= 0) {
                outStr += (str1.charAt(index - 1));
                outStr += (str1.charAt(index + str2.length()));
                str1 = str1.replaceFirst(str2, "");
            }
        }

        System.out.println(outStr);
    }

}
