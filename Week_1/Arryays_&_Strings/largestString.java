public class largestString {
    public static void main(String[] args) {
        System.out.println(" Largest String in Lexographical Order: ");
        String fruits[]={"apple" , "mango" , "banana"};
        largestStr(fruits);
    }
    public static void largestStr(String[] str) {
        String largest=str[0];
        for(int i=0;i<str.length;i++){
            if(largest.compareTo(str[i])<0){
                largest=str[i];
            }
        }
        System.out.println("Largest String is: "+largest);
    }
}
