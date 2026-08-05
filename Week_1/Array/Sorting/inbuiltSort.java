import java.util.Arrays;
import java.util.Collections;
public class inbuiltSort {

    
    public static void main(String[] args) {
        Integer arr[]={3,2,4,5,1};
    //     Arrays.sort(arr);
    // for (int i : arr) {
    //     System.out.print(i+" ");
    // }
    // System.out.println();
    // Arrays.sort(arr ,0,3);
    Arrays.sort(arr , Collections.reverseOrder());
    for (int i : arr) {
        System.out.print(i+" ");
    }
    }  

}
