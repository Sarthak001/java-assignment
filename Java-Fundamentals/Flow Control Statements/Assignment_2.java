
/*
Question 2 :
Write a program to check if a given integer number is odd or even.
*/


public class Assignment_2 {
    public static void main(String[] args) {
	    
        int num = Integer.parseInt(args[0]);  
	    if(num%2 == 0){
            System.out.println("Given number is: Even");
        }
        else{
            System.out.println("Given number is: Odd");
        }

	}
    
}
