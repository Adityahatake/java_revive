public class palindrome {
    public static void main(String[] args) {
        System.out.println("Palindrome check:");
        // String str="racecar";
        // String str2="Daksh";
        String str3="naman";
       

        System.out.println( checkPal(str3));
    }

    public static Boolean checkPal(String str) {
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                //not palindrome
                return false;
            
        }
        
    }
    return true; 
}
}
