public class count_Unique {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 3, 2, 1, 3, 4, 5, 6, 6, 5,12 };
        unique(arr);
        
    }
    public static void unique(int arr[]) {
        boolean visited[]= new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(visited[i]==true){
                continue;
            }
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}
