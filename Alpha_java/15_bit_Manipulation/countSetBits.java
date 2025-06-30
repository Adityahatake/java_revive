public class countSetBits {
    public static void count_Set_Bits(int n) { //method 1
        String a = Integer.toBinaryString(n);
        int count=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='1'){
                count++;
            }
        }
        System.out.println("Number of set bits = "+count);
    }
    public static void count_Set_Bits2(int n) { //method 2
        int count=0;
        while (n>0) {
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        System.out.println("Number of set bits = "+count);
    }


    public static void main(String[] args) {
        count_Set_Bits(10);
        count_Set_Bits2(10);
    }

}
