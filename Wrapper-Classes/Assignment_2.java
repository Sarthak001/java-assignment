public class Assignment_2 {
    public static void numsys(int num) {

        System.out.println("Given Number: " + num);
        System.out.println("Binary Equivalent: " + Integer.toBinaryString(num));
        System.out.println("Octal Equivalent: " + Integer.toOctalString(num));
        System.out.println("Hexadecimal Equivalent: " + Integer.toHexString(num));

    }

    public static void main(String[] args) {
        if (args.length > 1 || args.length < 1) {
            System.err.println("invaild arguments");
        } else {
            int num = Integer.parseInt(args[0]);
            numsys(num);

        }
    }

}
