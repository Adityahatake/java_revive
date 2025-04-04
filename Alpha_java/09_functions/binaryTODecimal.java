public class binaryTODecimal {

    public static void binToDec(int bin) {
        int pow=0;
        int dec=0;
        int myNum =bin;
       
        while (bin>0) {
            int last_digit= bin%10; //isse last digit nikalte h !
            dec =dec + (last_digit*(int)Math.pow(2 , pow));
            pow++;
            bin=bin/10; //isse number ko chota karte hai!
        }
        System.out.println("The Decimal number of ("+myNum+") is "+ dec);
    }


    public static void main(String[] args) {
        binToDec(111);
    }
}
