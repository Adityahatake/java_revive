public class fastExpo {
    public static void main(String[] args) {
        System.out.println("Fast Exponentiation: ");
        System.out.println(expo(3, 5));
    }

    public static int expo(int a, int n) {
        int ans = 1;

        while (n > 0) {
            if ((n & 1) != 0) { //check lsb
                ans=ans*a;
                

            }
            a=a*a;
                n=n>>1;
        }
        return ans;
    }

}
