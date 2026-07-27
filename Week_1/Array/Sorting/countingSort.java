public class countingSort {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 1, 4, 3, };
        counting(arr);
         for(int x: arr){
            System.out.print(x+" ");
        }
        
    }
    public static void counting(int[] arr) {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);

        }

        int count[]=new int[largest+1];
        for (int i =0; i<count.length;i++) {
            count[arr[i]]++;       
         }
         int j=0;
         for(int i=0;i<count.length;i++){
            while (count[i]>0) {
                arr[j]=i;
                j++;
                count[i]--;
            }
         }

    }
}
