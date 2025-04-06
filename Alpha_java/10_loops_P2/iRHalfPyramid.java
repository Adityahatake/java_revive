public class iRHalfPyramid {
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
        inverted_And_Rotated_Half_Pyramid(40);
        
    }
    
}
