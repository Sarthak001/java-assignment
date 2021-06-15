public class Assignment_8 {
    public static void main(String[] args) {
        int[] arr = { 1,6,4,7,9 };
        int sum = 0;
        int len = arr.length;
        int a = 0;
        int b = 0;

        for (int i = 0; i <= len - 1; ++i) {
            if (arr[i] == 6) {
                a = i;
            } else if (arr[i] == 7) {
                b = i;
            }
        }

        if (a < b) {
            for (int k = 0; k < a; ++k) {
                sum += arr[k];
            }
            for (int z = b + 1; z <= len - 1; ++z) {
                sum += arr[z];
            }
            System.out.println(sum);

        } else {
            for (int j = 0; j <= len - 1; ++j) {
                sum += arr[j];
            }
            System.out.println(sum);

        }

    }
}
