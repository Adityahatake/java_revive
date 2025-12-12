public class binary_strings_problem {
    public static void main(String[] args) {
        printStrings(3, 0 , new String(""));
    }
    //paytm: print all stirngs of size N without consicutive 1's
    public static void printStrings(int n , int lastplace , String str) { 
        //base case
        if(n==0){
            
            System.out.println(str);
            return;
        }
            //kaam
            // if(lastplace==0){
            //     printStrings(n-1, 0, str.append("0"));
            //     printStrings(n-1, 1, str.append("1"));
            // }else{
            //     printStrings(n-1, 0, str.append("0"));
            // }
            printStrings(n-1, 0, str+"0");
            if(lastplace==0){
             printStrings(n-1, 1, str+"1");
            }
    }

}
