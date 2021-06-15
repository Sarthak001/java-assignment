public class Assignment_19 {
    public static void main(String[] args) {
        int n = 0;
        int l = 0;
        do{
            if(n % 2 == 0 && n % 3 == 0 && n % 5 == 0){
                l += 1;
                System.out.println(n);
            }
            ++n;
        }while(l != 5);
    }
}
