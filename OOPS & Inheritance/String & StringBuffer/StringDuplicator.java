public class StringDuplicator {
    public static String duplicate(String str1){
        String res_str = "";
        int len = str1.length();
        for (int i = 0; i <= len - 1 ; ++i){

            res_str +=  "" + str1.charAt(0) + str1.charAt(1);
        }
        return res_str;

    }


    public static void main(String[] args) {

        if(args.length > 1 || args.length < 1){
            System.err.println("One one argument was required but 2 were given");
        }
        else{
            String res_str = "";
            res_str += duplicate(args[0]);
            System.out.println(res_str);
        }
        
    }
}
