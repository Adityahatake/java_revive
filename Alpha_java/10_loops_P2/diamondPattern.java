public class diamondPattern {
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
        diamond_Pattern(5);
    }
    
}
