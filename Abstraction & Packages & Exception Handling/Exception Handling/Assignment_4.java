class MathOperation {

    public void average(String [] arr) throws ArithmeticException , NumberFormatException {
        int len = arr.length;
        int sum = 0 ;

        for ( int i = 0 ; i <= len - 1 ; ++i){
            sum += Integer.parseInt(arr[i]);
        }

        System.out.println("Sum of array: " + sum + "\nAverage of array: " + (sum/len));


    }
}



public class Assignment_4 {
    public static void main(String[] args) {
        try{
            MathOperation obj = new MathOperation();
            obj.average(args);


        }catch(Exception e){
            System.err.println(e);
        }
  

    }
    
}