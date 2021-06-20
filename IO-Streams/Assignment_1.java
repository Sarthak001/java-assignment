import java.io.InputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class Assignment_1 {

    public static void main(String[] args) {

        try {
            Scanner agrsinput = new Scanner(System.in);
            System.out.println("Enter the File Name: ");
            String name = agrsinput.nextLine();
            System.out.println("Enter the Character to be counted: ");
            String chara = agrsinput.nextLine();
            agrsinput.close();
            int count = 0;
            FileInputStream input = new FileInputStream(name);
            int i = input.read();
    
            while (i != -1) {
                char f = (char) i;
                if (f == chara.charAt(0)) {
                    count += 1;
                }
                i = input.read();
            }
            input.close();
            System.out.println(count);

        } catch (Exception e) {
            // insert code to run when exception occurs
            System.err.println("file not");
        }

    }

}
