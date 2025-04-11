public class printSubarray {
    public static void print_Sub_Array(int array[]) {
        for(int i =0; i<array.length;i++){
            for(int j=i;j<array.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(array[k]+" ");
                }
                System.out.println();

            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) { //a continuos part of the array is called subarray 
        int array1[] = { 1, 2, 3, 4, 5 };
        print_Sub_Array(array1);

    }
    
}
