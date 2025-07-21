public class last_occurance {
    public static void main(String[] args) {
        System.out.println("test");
        int arr[]={5,6,5,5,5};
        System.out.println(loccurance(arr, 5, 0));

    }
    public static int loccurance(int[] arr , int key , int i ) {
        if(i==arr.length){
            return -1;
        }
        int isfound=loccurance(arr ,key , i+1);
        if(isfound==-1 && arr[i]==key){
            return i;
        }
        return isfound;

    }
}
