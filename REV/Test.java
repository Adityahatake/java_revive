public class Test{
    public static void main(String arg[]){
        System.out.println("REV DAY 1");
        int[] arr= {1,2,3,4,5,6};
        int arr2[]=new int[5];
        System.out.println(arr[1]);
        System.out.println(arr2[1]);

        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}