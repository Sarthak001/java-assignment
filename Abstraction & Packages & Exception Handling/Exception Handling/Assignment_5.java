import java.util.Scanner;
public class Assignment_5 {

    public static void div(int num1, int num2) throws ArithmeticException {

        System.out.println(num1 / num2);
    }

    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            input.close();
            div(num1, num2);

        } catch (Exception e) {

            System.err.println(e);

        }

    }
}
