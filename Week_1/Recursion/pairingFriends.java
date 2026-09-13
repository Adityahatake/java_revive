public class pairingFriends {
    public static void main(String[] args) {
        System.out.println("pait the friends");
        System.out.println(friendsPairing(3));
    }

    public static int friendsPairing(int n) {
        //base case 
        if(n==1||n==2){
            return  n;
        }
        // kaam(recursion)
        //choice : single
        int fnm1=friendsPairing(n-1);

        //choice : pair 
        int fmmn2=friendsPairing(n-2);
        int pairways =(n-1)*fmmn2;

        //total ways
        int totways=fnm1+pairways;

        return totways;

    }

}
