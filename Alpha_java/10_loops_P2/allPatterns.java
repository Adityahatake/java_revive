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
    // loop for rows itration
    for (int i = 1; i <= n; i++) {
      // loop for spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // loop for stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void inverted_Half_Pyramid_with_Numbers(int n) {

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  public static void floyds_Triangle(int n) {
    int num = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(num);
        num++;

      }
      System.out.println();
    }

  }

  public static void zero_One_Triangle(int totRows, int totCols) {
    for (int i = 1; i <= totRows; i++) {
      for (int j = 1; j <= i; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print("1");
        } else {
          System.out.print("0");
        }
      }
      System.out.println();
    }
  }

  public static void butterfly_Pattern(int n) {
    for (int i = 1; i <= n; i++) {
      // stars1
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      // spaces
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }
      // star2
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = n; i >= 1; i--) {
      // stars1
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      // spaces
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }
      // star2
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void rhombus_Pattern(int n) {
    for (int i = 1; i <= n; i++) {
      // spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // stars
      for (int j = 1; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    hollow_Ractangle(5, 5);

    inverted_And_Rotated_Half_Pyramid(5);

    inverted_Half_Pyramid_with_Numbers(5);

    floyds_Triangle(5);

    zero_One_Triangle(5, 5);

    butterfly_Pattern(5);

    rhombus_Pattern(5);

  }
}
