import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("\nEnter your age: ");
        int age = sc.nextInt();

        sc.nextLine(); // Consume newline left by nextInt()

        System.out.print("\nEnter your favorite color: ");
        String color = sc.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Favorite color: " + color);

        sc.close();
    }
}