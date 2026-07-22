public class pairs_in_array {
    public static void main(String[] args) {
        System.out.println("Pairs in array:");
        int[] arr={2,4,6,8,10};
        allpairs(arr);
    }

    public static void allpairs(int[] arr) {
        int tp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")" +" ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: "+tp);
    }
}
