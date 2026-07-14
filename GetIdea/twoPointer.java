public class twoPointer {
    public static void main(String[] args) {
        System.out.println("Test");
        int arr[]={0,1,2,3,4,5};
        reverseArray(arr);

    }
            // opposite two pointers 
    public static void reverseArray(int[] arr) {
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=right;  //swapping
            arr[right]=temp;
            left++;
            right--;
        }

        for (int x : arr) {
            System.out.print(x+" ");
        }
        
    }
    
}
