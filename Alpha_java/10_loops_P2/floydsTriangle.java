public class floydsTriangle {

    public static void floyds_Triangle(int n) {
        int num =1; 
        for (int i = 1; i <= n; i++) {
            for(int j=1; j<=i; j++){
                System.out.print(num);
                num++;

            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        floyds_Triangle(5);
        
    }
}