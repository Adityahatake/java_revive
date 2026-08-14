public class sorted_check {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        System.out.println(check(a, 0));
        
    }
    public static boolean check(int[] arr, int i ) {
        //base case 
        if(i==arr.length-1){
            return true;
        }
        
        if(arr[i]>arr[i+1]){
            return false;
        } 
        
        //recursion 
        return check(arr, i+1);
        
    }
}
