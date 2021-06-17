public class String10 {
    public static String repeat(String str1,int n){
        int len = str1.length();
        String toprint = str1.substring(len - n, len);
        String res_str = "";
        for (int i = 0 ; i <= n ; ++i){
            res_str += toprint;
        }
        return res_str;

    }
    public static void main(String[] args) {
        if (args.length > 2 || args.length < 2){
            System.err.println("Invaild arguments");
        }
        else{
            System.out.println(repeat(args[0],Integer.parseInt(args[1])));
        }
    }
    
}
