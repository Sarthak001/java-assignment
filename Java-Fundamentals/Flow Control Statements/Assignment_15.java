
public class Assignment_15 {
    public static void main(String[] args) {
        String number = args[0];
        int num = Integer.parseInt(number);
        int sum = 0;
        while(num  > 0){

            int v = num % 10;
            sum += v;
            num = num / 10;
        }
        System.out.println(sum);

    }
}
