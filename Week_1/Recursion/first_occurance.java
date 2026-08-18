public class first_occurance {
    public static void main(String[] args) {
        System.out.println("print the first occurance ");
                int[] arr = {5, 2, 8, 2, 9};

        System.out.println("First occurrence: " + check(arr, 9, 0));
    }
  
    public static int check(int[] arr , int n , int i) {
        //base case
        if(i==arr.length){
            return -1;
        }
        //recursive case
        if(arr[i]==n){
            return i;
        }
        return check(arr, n , i=i+1);
        
    }
}
