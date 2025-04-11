import java.util.*;
public class largestNumber {
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] = " + array[i]);
        }
    }
    public static void largest_Number(int array[]) {
        int largest_Number =Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>largest_Number){
            largest_Number = array[i];
            }
        }
        System.out.println("the largest number in the given array is: "+largest_Number);
        System.out.println("at index: "+linear_Search(array, largest_Number));  
    }
    public static int linear_Search(int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[]={ 12, 3, 35, 36, 17, 18, 4, 6, 43, 2, 21 };
        printArray(array);
        largest_Number(array);
    } 
}
