
/*
Question 1 :
W.A.P that accepts two strings as CLA and generate the desired output
*/

import java.util.Scanner;
public class Assignment_1
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    String company = input.next();
	    String city = input.next();
	    input.close()
	    System.out.println(company + " Technologies " + city);

	}
}

