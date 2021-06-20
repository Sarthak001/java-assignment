public class Demo1 {

    public String stringConcat(String str1 ,String str2){
        return str1 + str2;
    }
    public static void main(String[] args) {
        
        Demo1 obj = new Demo1();
        System.out.println(obj.stringConcat(args[0],args[1]));
    }
}
