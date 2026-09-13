public class binaryStrings {
    public static void main(String[] args) {
        System.out.println("Print all binary Stings without consecutive 1s");
        printStrings(3, 0, "");
    }
    public static void printStrings(int n, int lastPlace , String str) {
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam(recursion)
            printStrings(n-1, 0, str+"0");

        if(lastPlace ==0){
            //sit 0 on chir n 
            printStrings(n-1, 1, str+"1");
        }
    }
}
