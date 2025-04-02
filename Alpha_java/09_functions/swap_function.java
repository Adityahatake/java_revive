public class swap_function {
    public static void main(String[] args) {
        System.out.println("test statement !");
        int a= 10 ; int b= 12; 
        swap(a , b);
        System.out.println("First number(a)= "+ a );
        System.out.println("Second number(b)= "+ b );

    }


    public static void swap(int a , int b ) {
        int temp = a; 
        a = b; 
        b= temp; 
        System.out.println("First number(a)= "+ a );
        System.out.println("Second number(b)= "+ b );

    }
}
