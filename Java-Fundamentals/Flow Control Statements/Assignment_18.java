public class Assignment_18 {
    public static void main(String[] args) {
        String number = args[0];
        int num = Integer.parseInt(number);
        String r_str = "";
        while (num > 0) {

            int v = num % 10;
            r_str += String.valueOf(v);
            num = num / 10;
        }
        if(number.equals(r_str)){
            System.out.println(number + " is a palindrome");
        }
        else{
            System.out.println(number + " is not a palindrome");

        }
    }
    
}
