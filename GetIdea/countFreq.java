public class countFreq {
    public static void main(String[] args) {
        System.out.println("test");
        int arr[] = { 1, 2, 2, 3, 4, 3, 2, 1, 3, 4, 5, 6, 6, 5 };
        FreqCount(arr); 
    }

    public static void FreqCount(int arr[]) {
        boolean visited[] = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[i] == true){
                continue;}

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
        System.out.println(arr[i] + " -> " + count);

        }
    }
}
