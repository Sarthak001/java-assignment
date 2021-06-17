public class StringTrim {

    public static String trim (String str1){
         int len = str1.length();
         return (str1.substring(1, len - 1));
    }

    public static void main(String[] args) {
        if (args.length > 1 || args.length < 1){
            System.err.println("Provide vaild Arguments");
        }else{
            System.out.println(trim(args[0]));
        }
    }
    
}
