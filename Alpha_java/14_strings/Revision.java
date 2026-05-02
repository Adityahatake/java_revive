// import java.util.Scanner;
public class Revision {
    public static void main(String[] args){
        String name ="daksh";
        System.out.println(name);
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter you name: ");
        // String name_input = sc.nextLine();
        // System.out.println("your name is "+name_input);
        

        //concatenation
        String first_name = "Aditya";
        String last_name = "Daksh";
        String full_name =first_name+ " " + last_name;
        System.out.println("Your fullname is "+full_name);
        //String methods
        String name1 = "Aditya Daksh";

        System.out.println(name1.length());
        System.out.println(name1.toUpperCase());
        System.out.println(name1.toLowerCase());
        System.out.println(name1.charAt(0));
        System.out.println(name1.indexOf("D"));
        System.out.println(name1.substring(0,6));
        System.out.println(name1.replace("a", "x"));
        System.out.println(name1.contains("Daksh"));
        System.out.println(name1.startsWith("Adi"));
        //Comparing strings
        String name2 = "Shivansh Daksh";
        
        System.out.println(name1.equals(name2)); //Fails in some cases ex: "Aditya Daksh" and "Aditya Daksh " (with space at the end)
        System.out.println(name1.compareTo(name2)); //better way to compare strings
        //s1>s2 => +ve
        //s1<s2 => -ve  
        //s1==s2 => 0

    }
}
