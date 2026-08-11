public class countSetBits {
    public static void main(String[] args) {
        System.out.println(cSB(14));
    }
    public static int cSB(int n){
        int count =0;
        while(n>0){
            if((n&1)!=0){ //check lsb
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}
