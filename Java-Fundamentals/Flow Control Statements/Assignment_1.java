
/*
Question 1 :
W.A.P to check if a given integer is +ve , -ve or zero
*/
public class Assignment_1
{
	public static void main(String[] args) {
	    
        int num = Integer.parseInt(args[0]);  
	    if(num < 0){
            System.out.println("Given number is: Negative");
        }
        else if(num > 0) {
            System.out.println("Given number is: Positive");
        }
        else{
            System.out.println("Given number is: Zero");
        }

	}
}

