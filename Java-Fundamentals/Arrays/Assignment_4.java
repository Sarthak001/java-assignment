public class Assignment_4 {
    public static void main(String[] args) {
        int[] arr = { 65, 95, 101, 122, 98, 96, 94 };
        int len = arr.length;
        for (int i = 0; i <= len - 1; ++i) {
            if (i != len - 1) {
                System.out.print((char) arr[i] + " ");
            } else {
                System.out.println((char) arr[i] + " ");

            }

        }

    }

}
