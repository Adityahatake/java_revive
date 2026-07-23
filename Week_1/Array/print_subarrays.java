public class print_subarrays {
    public static void main(String[] args) {
        System.out.println("printing subsarrays: ");
        int[] arr={2,4,6,8,10};
        subarrays(arr);
    }
    public static void subarrays(int[] arr) {
    int tsa=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for (int k = i; k <=j; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
                tsa++;
            }
            System.out.println();
        }
        System.out.println("Total subarrays: "+tsa);
    }
}
