import java.nio.file.Path;

public class shortest_route {
    public static void main(String[] args) {
        System.out.print("Find the shortest path: ");
        String str= "WNEENESENNN";
        System.out.println(Path(str));
    }

    public static int Path(String str) {
        int x=0;
        int y=0;
        int sp=0;
        for(int i=0;i<str.length();i++){
            switch (str.charAt(i)) {
                case 'N': //North
                    y++;
                   break;
                case 'S': //South
                    y--;
                   break;

                case 'E': //East
                    x++;
                   break;
                case 'W': //West
                    x--;
                   break;              
                
            }         
        }
        sp=(int)Math.sqrt(x*x+y*y);
        return sp;
    }

}
