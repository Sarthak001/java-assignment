import java.util.Arrays;   
public class Assignment_6 {
    public static void main(String[] args) {
        int [] arr = {123,45,34,234,1,23,545,2,3,46,65,7};
        int len = arr.length;
        Arrays.sort(arr);
        for (int i = 0 ; i <= len - 1 ; ++i){
            if(i != len - 1){
                System.out.print(arr[i] + " ");
            }
            else{
                System.out.println(arr[i]);
            }
        }
    }
    
}
