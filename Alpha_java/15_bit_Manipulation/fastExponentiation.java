public class fastExponentiation {
    public static void fast_Expo(int a ,int n) {
        int ans=1;
        while (n>0) {
            if((n&1)!=0){ //check LSB
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        fast_Expo(3, 5);
    }
}
