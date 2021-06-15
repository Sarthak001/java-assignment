public class Assignment_9 {
    public static void main(String[] args) {

        int a[][] = new int[2][2];
        int k = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = Integer.parseInt(args[k]);
                k++;
            }
        }

        for(int i = 0; i < 2; i++) {
	        for(int j = 0; j < 2; j++) {
	            System.out.print(a[i][j] + " ");
    	    }
    	    System.out.println();
	    }
	
        for (int i = 1; i >= 0; i--) {
            for (int j = 1; j >= 0; j--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

}
