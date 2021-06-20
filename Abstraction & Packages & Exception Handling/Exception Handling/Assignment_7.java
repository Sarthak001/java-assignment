import java.util.Scanner;

class InvalidCountryException extends Exception{
    public InvalidCountryException(String s){
        super(s);
    }
}

class UserRegistration{
    public void registerUser(String username,String userCountry) throws InvalidCountryException{
        String validcontry = "India";
        if(userCountry.equals(validcontry)){
            System.out.println("User registration done successfully");
        }
        else{
            throw new InvalidCountryException("User Outside India cannot register");
        }

    }
}


public class Assignment_7{
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Your Username:");
            String username = input.nextLine();
            System.out.println("Enter Your Country:");
            String userCountry = input.nextLine();
            input.close();
            UserRegistration obj = new UserRegistration();
            obj.registerUser(username, userCountry);

        }catch(Exception e){
            System.err.println(e);
        }
    }
}