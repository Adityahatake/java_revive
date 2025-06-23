import java.util.*;

public class Stringbt {
    public static void main(String[] args) {
        System.out.println("test");

        String str1 = "daksh";
        String str2 = new String("daksh");

        // Compare references (this will print false)
        System.out.println(str1 == str2);

        Scanner sc = new Scanner(System.in);

        // Input for programming language
        System.out.print("Enter the name of your current programming language: ");
        String lang = sc.nextLine();  // Use nextLine to read full input
        System.out.println("Language: " + lang);

        // Input for favorite hero
        System.out.print("Enter the name of your fav hero: ");
        String hero = sc.nextLine();  // Will now wait properly for input
        System.out.println("Hero: " + hero);

        sc.close();
        //concatanation
        String Fname="Aditya";
        String Lname = "Daksh";
        String fullName= Fname + " " + Lname;
        System.out.println("Fullname is: " +fullName);

    }
}
