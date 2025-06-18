import java.util.*;


public class reverseinbuilt {
 
    public static void main(String[] args) {
        Integer arr[] = { 1, 4, 3, 2, 5 };
        Arrays.sort(arr , Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
