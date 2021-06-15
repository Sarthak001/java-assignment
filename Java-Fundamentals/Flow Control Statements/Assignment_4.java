/*
Question 4 :
Initialize two character variables in a program and display the characters in alphabetical
order.

*/
public class Assignment_4 {
    public static void main(String[] args) { 
        char a = args[0].charAt(0);
        char b = args[1].charAt(0);
        int a_ascii = (int)a;
        int b_ascii = (int)b;
      
        if(a_ascii > b_ascii){
            System.out.println(b + "," +a);
        }
        else{
            System.out.println(a + "," + b);
 
        }
}
}
