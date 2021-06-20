import java.util.Scanner;
public class Assignment_3 {
    public static void main(String[] args) {
        try{

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number of elements in the array: ");
            int size = input.nextInt();
            int [] arr = new int[size];

            for (int i = 0 ; i < size ; ++i){
                System.out.println("Enter " + i + " th element of array");
                int val = input.nextInt();
                arr[i] = val;
            }
            System.out.println(" \n Enter the index of the array element you want to access: ");
            int search = input.nextInt();
            System.out.println("The array element at index " + search + ": " + arr[search] + "\n The array element successfully accessed");
            input.close();


        }catch(NumberFormatException e ){
            System.err.println(e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println(e);

        }

    }
}
