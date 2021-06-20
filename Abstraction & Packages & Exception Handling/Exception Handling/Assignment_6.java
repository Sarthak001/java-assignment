import java.util.Scanner;
class negative extends Exception {
    public negative(String s){
        super(s);
    }
}
class outofrange extends Exception {
    public outofrange(String s){
        super(s);
    }
}


public class Assignment_6 {
    public static void main(String[] args) {
        try{
            int sum,sum2;
            sum = sum2 = 0;
            int [] stud = new int[3] ;
            int [] stud2 = new int[3] ;
            Scanner input = new Scanner(System.in);
            int num;
            for (int i = 0 ; i < 3 ; ++i){
                System.out.println("Enter the subjects marks for student 1: ");
                num = input.nextInt();

                if( num > 100){
                    throw new outofrange("Input out of range");
                }
                else if (num < 0){
                    throw new negative("Input out of range");
                }else{
                    stud[i] = num;
                }
            }
            for (int i = 0 ; i < 3 ; ++i){
                System.out.println("Enter the subjects marks for student 2: ");
                num = input.nextInt();

                if( num > 100){
                    throw new outofrange("Input out of range");
                }
                else if (num < 0){
                    throw new negative("Input out of range");
                }else{
                    stud2[i] = num;
                }
            }

            for (int j = 0 ; j <= 2 ; ++j){
                sum += stud[j];
                sum2 += stud2[j];
            }

            System.out.println("Average marks of student 1: " + (sum /3) + "\nAverage marks of student 2: " + (sum2/3));


            input.close();
        }catch(Exception e){
            System.err.println(e);

        }
        
    }
    
}
