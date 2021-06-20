import java.util.Scanner;
public class Assignment_9 {

    public static void div(int num1, int num2) throws ArithmeticException {

        System.out.println("The quotient of " + num1 +  "/" + num2 + " = " + (num1/num2));
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

        }finally{
            System.out.println("Inside Finally block");
        }

    }
}
