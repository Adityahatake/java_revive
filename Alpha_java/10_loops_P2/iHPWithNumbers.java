public class iHPWithNumbers {
    public static void inverted_Half_Pyramid_with_Numbers(int n) {
        
        for(int i =1; i<=n; i++){
            for(int j=1;j<=n-i+1;j++){
                
                System.out.print(j);
                
                
            }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //expected output :   // { 12345
                              //   1234
                              //   123
                              //   12
                              //   1     }
                              
       inverted_Half_Pyramid_with_Numbers(5);
    }
}
