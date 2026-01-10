public class first_occurance {
    public static void main(String[] args) {
        int arr[]={5,6,7,};
       foccurance(arr, 5, 0);
    }
    public static void foccurance(int[] arr ,int key , int i) {
        if(i==arr.length-1){
            System.out.println("not found bro");
        }if(arr[i]==key){
            System.out.println("found at index: "+i);
        }else{
        foccurance(arr, key ,i+1);
        }
    }
}


// need to write a code using recursion 
// to find the first iccurance of a element in
// an array

