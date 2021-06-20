import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileOutputStream;

public class Assignment_2 {
    public static void main(String[] args) {

        try {
            String data = "";
            Scanner agrsinput = new Scanner(System.in);
            System.out.println("Enter the File Name: ");
            String name = agrsinput.nextLine();
            System.out.println("Enter the Output name: ");
            String oname = agrsinput.nextLine();
            agrsinput.close();
            FileInputStream input = new FileInputStream(name);
            int i = input.read();
            while (i != -1){

                data += (char)i;
                i = input.read();
            
            }
            byte[] array = data.getBytes();
            FileOutputStream output = new FileOutputStream(oname);
            output.write(array);
            output.close();
            input.close();

            System.out.println("File copied successfully!! \n" + "File Contents: " + data);

        } catch (Exception e) {
            System.err.println("file not found");
        }
    }
}
