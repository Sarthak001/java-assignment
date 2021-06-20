import java.util.Scanner;

public class Assignment_3 {

    public static void bincov(int num) {
        String res = "", bin = "";
        bin += Integer.toBinaryString(num);
        int f = Integer.parseInt(bin);
        res += String.format("%08d",f);
        System.out.println(res);   
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        input.close();
        bincov(num);

    }

}
