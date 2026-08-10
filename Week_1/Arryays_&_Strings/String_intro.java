import java.util.*;
public class String_intro {

    public static void printString(String str) {
        for (int i=0; i<str.length() ; i++) {
            System.out.print(str.charAt(i)+" ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Strings");
        // char arr[]={'a','b','c','d'};
        // String str="abcd";
        // String str2=new String("xyz");

        // Scanner sc= new Scanner(System.in);

        // System.out.print("Enter your name: ");
        // String name=sc.nextLine();
        // System.out.println(name);

        String fullName="Aditya Daksh";
        System.out.println(fullName.length( ));
        System.out.println(fullName.charAt(1));
        printString(fullName);


    }
}
