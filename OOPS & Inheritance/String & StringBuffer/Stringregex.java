import java.util.Scanner;

public class Stringregex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = scan.nextLine();
		
		String[] stars = str.split(".[\\*]+.");
		
		StringBuffer sb = new StringBuffer();
		
		for (String x : stars)
			sb.append(x);
		
		System.out.println(sb);
	}

}
