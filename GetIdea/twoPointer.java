public class twoPointer {
    public static void main(String[] args) {
        System.out.println("Test");
        int arr[]={0,1,2,3,4,5};
        reverseArray(arr);
        starPattern();

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
    // for the same two pointers consider printing a star patter 
    public static void starPattern(){
        for(int i=0; i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
