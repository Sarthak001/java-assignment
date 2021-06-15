public class Assignment_3 {
    public static void main(String[] args) {
        int num = 45;
        int [] arr = {32,234,354,45,325,46,123};
        int len = arr.length;
        boolean last = true;
        for(int i = 0 ; i <= len - 1 ; ++i){
            if ( arr[i] == num){
                last = false ; 
                System.out.println("Element " + num + " found at index : " + i);
                break;
            }
        }
        if(last){
            System.out.println("-1");
        }
    }
    
}
