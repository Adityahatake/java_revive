public class Traversing {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("test");
        printAllElements(arr);
        System.out.println();
        printAllElementsReverse(arr);
        System.out.println();
        printEven(arr);
        System.out.println();
        printOdd(arr);
        System.out.println();
        printEvenIdx(arr);
        System.out.println();
        printOddIdx(arr);
    }
    public static void printAllElements(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }       
    }

     public static void printAllElementsReverse(int arr[]) {
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");         
        }       
    }

    public static void printEven(int arr[]) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
               System.out.print(arr[i]+" ");  
            }
        }
       
    }
    public static void printOdd(int arr[]) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
               System.out.print(arr[i]+" ");  
            }
        }
       
    }
        public static void printEvenIdx(int arr[]) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
               System.out.print(i+" ");  
            }
        }
       
    }
    public static void printOddIdx(int arr[]) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
               System.out.print(i+" ");  
            }
        }
       
    }
   
}
