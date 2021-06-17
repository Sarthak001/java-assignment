public class Calculator {

    public static double powerInt(int num1,int num2){
        return (Math.pow(num1, num2));
    }

    public static double powerInt(double num1,int num2){

        return (Math.pow(num1, num2));
    }
    public static void main(String[] args) {
        double res;
        res = Calculator.powerInt(2.0, 2);
        System.out.println(res);
        res = Calculator.powerInt(2, 3);
        System.out.println(res);

    }
}
