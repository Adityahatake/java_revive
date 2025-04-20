public class selection_Sort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minpos]){
                    minpos=j;                  
                }
            }
            //swap
            int temp =arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
        printArray(arr);
    }
    public static void main(String[] args) {
        int array[] = { 5, 4, 1, 2, 3 };
        System.out.println("array before sort: ");
        printArray(array);
        System.out.println();
        System.out.println("array after sort: ");
        selectionSort(array);
        
    }
}
