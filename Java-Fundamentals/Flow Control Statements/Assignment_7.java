public class Assignment_7 {
    public static void main(String[] args) {
        char c = args[0].charAt(0);

        if(Character.isLowerCase(c)){
            System.out.println(Character.toUpperCase(c));
        }
        else{
            System.out.println(Character.toLowerCase(c));
        }
    }
}
