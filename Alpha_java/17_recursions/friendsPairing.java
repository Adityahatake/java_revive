public class friendsPairing {
    public static void main(String[] args) {
        System.out.println(pairing(3));
    }
    public static int pairing(int n ) {
        // basecase
        if(n==1||n==2){
            return n;
        }
    //     // single
    //    int fm1=pairing(n-1);
    //     // pair
    //    int fm2=pairing(n-2);
    //     int totways= fm1+(n-1)*fm2;
    //    return totways;
    return pairing(n-1)+(n-1)*pairing(n-2);
    }
}

/*
 * Given n friends, each one can remain single or can be paired
 * up with some other friend. Each friend can be paired only once.
 * Find out the total number of ways in which friends can remain
 * single or can be paired up.
 * ye kisi toh company mai aaya tha yaad nhi...
 */
