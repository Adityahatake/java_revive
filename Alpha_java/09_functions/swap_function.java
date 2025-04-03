public class swap_function {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("First number(a)= " + a);
        System.out.println("Second number(b)= " + b);

    }

    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        swap(a, b);
        System.out.println("java always cal;ls by value");
        System.out.println("First number(a)= " + a);
        System.out.println("Second number(b)= " + b);

    }

}
