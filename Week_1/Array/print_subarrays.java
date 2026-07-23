public class print_subarrays {
    public static void main(String[] args) {
        System.out.println("printing subsarrays: ");
        int[] arr={2,4,6,8,10};
        subarrays(arr);
    }
    public static void subarrays(int[] arr) {
    int tsa=0;
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for (int k = i; k <=j; k++) {
                    System.out.print(arr[k]+" ");
                    sum=sum+arr[k];
                    
                }
                if(sum>max){
                    max=sum;
                }
                if(sum<min){
                    min=sum;
                }
                System.out.println(" sum:"+sum);
                System.out.println();
                tsa++;
            }
            System.out.println();
        }
        System.out.println("Total subarrays: "+tsa);
        System.out.println("MAX: "+max);
        System.out.println("MIN: "+min);
    }
}
