import java.util.*;
public class smallestNumber {

        public static void printArray(int array[]) {
            for (int i = 0; i < array.length; i++) {
                System.out.println("[" + i + "] = " + array[i]);
            }
        }

        public static void smallest_Number(int array[]) {
            int smallest_Number = Integer.MAX_VALUE;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < smallest_Number) {
                    smallest_Number = array[i];
                }
            }
            System.out.println("the smallest number in the given array is: " + smallest_Number);
            System.out.println("at index: " + linear_Search(array, smallest_Number));
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
            int array[] = { 12, 3, 35, 36, 17, 18, 4, 6, 43, 2, 21 };
            printArray(array);
            smallest_Number(array);

        }
    }
