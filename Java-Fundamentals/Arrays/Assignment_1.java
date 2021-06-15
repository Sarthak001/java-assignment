public class Assignment_1 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        double len = arr.length;
        int sum = 0;
        double avg;
        for (int i = 0 ; i <= len - 1 ; ++i){
            sum += arr[i];
        }
        avg = (sum / len);
        System.out.println("Sum of array : " + sum);
        System.out.println("average of array : " + avg);

    }
    
}
