public class Assignment_16 {
   public static void main(String[] args) {
      int n = Integer.parseInt(args[0]);
      int i, j;
      for (i = 0; i < n; i++) {
         for (j = 0; j <= i; j++) {
            System.out.print("* ");
         }

         System.out.println();
      }

   }
}
