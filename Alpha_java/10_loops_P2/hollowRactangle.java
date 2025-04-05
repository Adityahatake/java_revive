public class hollowRactangle {

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

  public static void main(String[] args) {
    hollow_Ractangle(4, 5);

  }
}