import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    
    public static void bucketSort(float[] arr) {
        int n = arr.length;
        if (n <= 0)
            return;

        // Create n empty buckets
        @SuppressWarnings("unchecked")
        ArrayList<Float>[] buckets = new ArrayList[n];
        
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Put array elements into different buckets
        for (float value : arr) {
            int bucketIndex = (int) (n * value); // assuming value in range [0,1)
            buckets[bucketIndex].add(value);
        }

        // Sort individual buckets
        for (ArrayList<Float> bucket : buckets) {
            Collections.sort(bucket);
        }

        // Concatenate all buckets into arr[]
        int index = 0;
        for (ArrayList<Float> bucket : buckets) {
            for (float value : bucket) {
                arr[index++] = value;
            }
        }
    }

    // Main method to test
    public static void main(String[] args) {
        float[] arr = { (float)0.897, (float)0.565, (float)0.656,
                        (float)0.1234, (float)0.665, (float)0.3434 };

        System.out.println("Original array:");
        for (float value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        bucketSort(arr);

        System.out.println("Sorted array:");
        for (float value : arr) {
            System.out.print(value + " ");
        }
    }
}
