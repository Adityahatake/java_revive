import java.util.Scanner;

public class array_input{
    public static void main(String args[]){
        System.out.println("Test");
        Scanner sc=new Scanner(System.in);
        System.out.print("What is your name: ");
        String name=sc.nextLine() ;  
        System.out.println(name);
        int[] arr=new int[5];
        //taking input;
        for(int i=0;i<arr.length;i++){
            System.out.print("Arr["+i+"]: ");
            arr[i]=sc.nextInt();
        }
        //printing array
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}