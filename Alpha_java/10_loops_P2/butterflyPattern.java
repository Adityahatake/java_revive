public class butterflyPattern {
    public static void butterfly_Pattern(int n) {
        for(int i =1; i<=n; i++){
            //stars1
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j =1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //star2
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =n; i>=1; i--){
            //stars1
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j =1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //star2
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        butterfly_Pattern(4);
        
    }
}
