public class largestString {
    // find the largest String in lexicographically
    public static void largest_String(String arr[]) {
        String largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(largest.compareTo(arr[i])<0){
                largest=arr[i];               
            }
        }
        System.out.println("the largest String is: "+largest);
        
    }
    public static void main(String[] args) {
        String fruits[]={"apple","mango","papaya"};
        largest_String(fruits);
    }
}
