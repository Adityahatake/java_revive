public class reverse {
    public static void main(String[] args) {
        System.out.println("Reverse Array(Optimised approach):");
         int arr[] = { 1, 2, 3, 4, 5, 6 };
         rev(arr);
         printarray(arr);
    }
    public static void rev(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while(s<e){
            arr[s]=arr[s]+arr[e];
            arr[e]=arr[s]-arr[e];
            arr[s]=arr[s]-arr[e];
            s++;
            e--;
        }
    }
    public static void printarray(int arr[]){
        for(int x: arr) {
            System.out.print(x+" ");
        }
    }

}
