public class bubbleSort{
    public static void main(String[] args) {
        System.out.println("Bubble Sort: ");
        int arr[]={2,3,5,1,4,3,24,43,14,24,76,68,87};
        bubble(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static void bubble(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]) {
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                }
            }
        }
    }
}