public class sumOfSubarray {
    
        public static void print_Sub_Array(int array[]) {
            int cur_sum=0;
            int max_sum=Integer.MIN_VALUE;
            for (int i = 0; i < array.length; i++) {
                for (int j = i; j < array.length; j++) {
                    cur_sum = 0;
                    for (int k = i; k <= j; k++) {
    
                        cur_sum = cur_sum + array[k];
                        System.out.print(array[k] + " ");
                    }
                    System.out.print("  sum:" + cur_sum);
                    System.out.println();
                    if (max_sum<cur_sum) {
                        max_sum=cur_sum;
                        
                    }

    
                }
                
                System.out.println();
    
            }
            System.out.println("Max Sum: "+max_sum);
        }
    public static void main(String[] args) {
        int array1[] = { 1, 2, 3, 4, 5 };
        print_Sub_Array(array1);
        
    }
}

