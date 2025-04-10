public class reveseAnArray {
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("{" +array[i] + "}");
        }
    }
    public static void reverse_Array(int array[]) {
        int first=0; 
        int last = array.length -1;
        while (first<last) {
            //using swap to reduce the space complexity

            int temp =array[first];
            array[first]=array[last];
            array[last]=temp;
            first++;
            last--;
        }
        printArray(array);
    
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4};
        reverse_Array(array);

    }
}
