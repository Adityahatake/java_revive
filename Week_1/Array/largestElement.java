public class largestElement {
    public static void main(String[] args) {
        System.out.println("Largest Element:");
         int arr[] = { 1, 233, 3, 4, 5, 6,12 };
         large(arr);
    }

    public static void large(int[] arr) {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("Largest number:"+largest);
    }
}
