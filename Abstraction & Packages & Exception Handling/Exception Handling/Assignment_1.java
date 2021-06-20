import java.util.Scanner;

public class Assignment_1 {
    
    public static void main(String[] args) {

        try{
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            System.out.println("The Square value is: " + (num * num));
            input.close();

        }catch(Exception e) {

            System.err.println("Input is not a valid format for an integer.");
        }
        
    }
}
