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

public static void diamond_Pattern(int n) {
  // first half 
  for(int i=1; i<=n;i++){
      // spaces
      for(int j=1; j<=n-i;j++){
          System.out.print(" ");
      }
      //stars
      for(int j=1; j<=(2*i-1);j++){
          System.out.print("*");
      }
      System.out.println();
  }
  // second half
  for(int i=n; i>=1;i--){
      // spaces
      for(int j=1; j<=n-i;j++){
          System.out.print(" ");
      }
      //stars
      for(int j=1; j<=(2*i-1);j++){
          System.out.print("*");
      }
      System.out.println();
  }
  
}

  public static void main(String[] args) {
    hollow_Ractangle(10, 10);

    inverted_And_Rotated_Half_Pyramid(10);

    inverted_Half_Pyramid_with_Numbers(10);

    floyds_Triangle(10);

    zero_One_Triangle(10, 10);

    butterfly_Pattern(10);

    rhombus_Pattern(10);

    hollow_Rhombus(10 ,10);

    diamond_Pattern(10);

  }
}
