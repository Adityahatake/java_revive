public class hollowRhombus {
    public static void hollow_Rhombus(int totRows,int totCols) {
        for (int i = 1; i <= totRows; i++) {
            //spaces
            for(int j=1;j<=totRows-i;j++){
                System.out.print(" ");

            }
            //hollow ractangle
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
    public static void main(String[] args) {
        hollow_Rhombus(5, 5);
        
    }
}