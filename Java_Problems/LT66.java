public class LT66 {
        public static void plusOne(int[] digits) {
        int num=0;
        for(int i=0;i<digits.length;i++){
            num=num*10+digits[i];
        }
        num=num+1;
        System.out.println(num);
        
    }
    public static void main(String[] args) {
        System.out.println("test");
        int[] digits={1,2,3,};
        plusOne(digits);
    }
}
