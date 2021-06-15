
public class Assignment_5 {
    public static void main(String[] args) { 
        char var = args[0].charAt(0);
        int ascii = (int)var;
        if( (ascii >= 65 && ascii < 90 ) || (ascii >= 97 && ascii <= 122 ) ){
            System.out.println("Alphabhet");
        }
        else if(ascii >= 48 && ascii <= 57){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Character");
        }
    }
}
