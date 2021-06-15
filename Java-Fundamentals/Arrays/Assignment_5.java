public class Assignment_5 {
    public static void main(String[] args) {
        int max = 0;
        int max_2 = 0;
        int [] arr = {1,32,34,3,23,343,44};
        int len = arr.length;
        for (int i = 0 ; i <= len - 1 ; ++i){
            if(arr[i] > max ){
                max_2 = max;
                max = arr[i];
            }
        }
        System.out.println("first maximum no in given array : " + max);
        System.out.println("Second maximum no in given array : " + max_2);

    }
    
}
