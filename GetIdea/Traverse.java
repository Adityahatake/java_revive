public class Traverse{
    public static void main(String args[]){
        System.out.println("Test");
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(largest(arr));
    }
    public static int largest(int arr[]){
        int l=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>l){
                l=arr[i];

            }

        }
        return l;
    }
}