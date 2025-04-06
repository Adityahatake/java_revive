public class allPatterns {

    public static void hollow_Ractangle(int totRows, int totCols) {
        for (int i = 1; i <= totRows; i++) {
          for (int j = 1; j <= totCols; j++) {
            if (i == 1 || i == totRows || j == 1 || j == totCols) {
              System.out.print("*");
            } else {
              System.out.print(" ");
            }
    
          }
          System.out.println();
        }
      }

      public static void inverted_And_Rotated_Half_Pyramid(int n) {
        //loop for rows itration
        for(int i= 1 ; i<=n ; i++){
            //loop for spaces 
            for(int j =1 ; j<=n-i; j++){
                System.out.print(" ");
            }
            //loop for stars 
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_Ractangle(5, 5);
        inverted_And_Rotated_Half_Pyramid(5);
    }
}
