public class Assignment_2 {
    public static void main(String[] args) {

        int [] arr = {5,2,3,4,1,6,8,2};
        int len = arr.length;
        int max = 0;
        int min = arr[0];
        for(int i = 0 ; i <= len - 1 ; ++i){
            if(arr[i] > max){
                max = arr[i];
            }
            else if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Max element in arr :" + max);
        System.out.println("Min element in arr :" + min);


        
    }
    
}
