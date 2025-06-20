import java.util.*;
public class creation {

    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n=3 , m=3; 
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Element for the "+n+"*"+m+" matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //printing the matrix
        System.out.println("output matrix: ");
           for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}