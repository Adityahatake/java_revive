import java.util.*;
public class Area_of_circle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle : ");
        float rad = sc.nextFloat();
        // double PI= 3.14;
        Float Area= 3.14f*rad*rad;
        System.out.println("The area of the Circle is: "+Area);
    }
    
}
