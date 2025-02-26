import java.util.*;
public class java_Input {
    public static void main(String[] args) {
        System.out.println("test");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age =sc.nextInt();
        sc.nextLine();
        System.out.print("\nEnter your name: ");
        String name =sc.nextLine();
        System.out.println("Your age is "+age);
        System.out.println("Your name is "+name);
    }
    
}
