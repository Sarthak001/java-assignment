/*
Question 3 :
Write a program to check if the program has received command line arguments or not.

If the program has not received arguments then print "No Values", else print all the values
in a single line separated by , (comma)

Example1) java Example
0/P: No values

Example2) java Example Mumbai Bangalore
0/P: Mumbai, Bangalore

*/

public class Assignment_3 {
    public static void main(String[] args) {
        int len = args.length;
        if(len == 0){
            System.out.println("No Values");
        }
        else{
            for(int i = 0 ; i <= len - 1 ; ++i ){
                if(i != len -1){
                    System.out.printf(args[i] +",");
                }
                else{
                    System.out.println(args[i]);
                }
            }
        }
    }
}
