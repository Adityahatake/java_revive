public class tiling {

    public static void main(String[] args) {
        System.out.println("Tiling Problem! ");
        int n =4;
        System.out.println(tiles(n));

    }
    public static int tiles(int n ) { //2*n is floor size 
        //base case
        if(n==1 || n==0){
            return 1;
        }
        //recursive case(Kaam)

        //vertical choice 

        int fnm1= tiles(n-1);

        //horizontical choice 
        int fnm2=tiles(n-2);

        int totalWays=fnm1+fnm2;

        return  totalWays;


    }
}