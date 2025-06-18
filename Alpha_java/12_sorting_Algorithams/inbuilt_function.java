import java.util.Arrays;
public class inbuilt_function {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 2, 5 };
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
