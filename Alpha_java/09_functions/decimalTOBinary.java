public class decimalTOBinary {
    public static void decToBin(int n) {
        int pow =0; 
        int bin =0;
        while (n>0) {
        int rem = n%2; //isse remainder digit nikalte h !
        bin = bin + rem*(int)Math.pow(10, pow);
        pow++;
        n=n/2; // iss case mai isse number chote hoga kyuki ye binary to decimal h  
        }
        System.out.println("the binary is: "+bin);
        
    }
    public static void main(String[] args) {
        System.out.println("test staement");
        decToBin(12);
    }
}
