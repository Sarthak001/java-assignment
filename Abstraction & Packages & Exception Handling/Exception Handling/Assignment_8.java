
class ageverfiy extends Exception{

    ageverfiy(String s){
        super(s);
    }
}

public class Assignment_8 {

    public static void main(String[] args) {
    try{
        if(args.length > 2 || args.length < 2){
            System.err.println("invalid arguments");
        }
        else{
            String name = args[0];
            int age = Integer.parseInt(args[1]);

            if(age >= 18 && age < 60){
                System.out.println( "Name: "+name + "\nAge: " + age);

            }else{
                throw new ageverfiy("Invalid age");
            }
            
        }

    }catch(Exception e){
        System.err.println(e);
    }
    }
    
}
