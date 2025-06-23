public class routeDistance {
    public static void getShortestDistance(String path) {
        int x=0 ,y=0;

        for(int i=0;i<path.length();i++){
           //west
           if(path.charAt(i)=='W'){
            x--;
           } 
           //east
            if(path.charAt(i)=='E'){
            x++;
           } 
           //south 
           if(path.charAt(i)=='S'){
            y--;
           } 
           //north
           if(path.charAt(i)=='N'){
            y++;
           }        
    }
    int x2=x*x;
    int y2=y*y;
    int finaldistance=(int)Math.sqrt(x2+y2);
    System.out.println("Final Shortest Distance is: "+finaldistance);
}
    public static void main(String[] args) {
        String path="WNEENESENNN";
        getShortestDistance(path);
    }
}
