public class clearIthBit {
    public static void main(String[] args) {
        System.out.println(clearbitith(10, 1));

        int s=update(10, 2, 1);
        System.out.println(s);
    }
    public static int clearbitith(int n , int i) {
        int bitmask =~(1<<i);
        return n &bitmask;
    }
      public static int setbitith(int n , int i) {
        int bitmask =1<<i;
       return (n|bitmask);
    }
    public static int update(int n , int i , int newbit) {
        if(newbit==0){
            return clearbitith(n, i);
        }else{
            return setbitith(n, i);
        }
    }
    
}
