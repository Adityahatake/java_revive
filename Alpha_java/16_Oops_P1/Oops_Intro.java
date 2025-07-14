public class Oops_Intro {
    public static void main(String[] args){
        Pen P1=new Pen();
        P1.setColor("pink");
        System.out.println(P1.color);
        P1.setTip(3);
        System.out.println(P1.tipSize);
    }
}
class Pen{
    String color;
    int tipSize;

    void setColor(String newcolor){
        color=newcolor;
    }
    void setTip(int newTip){
        tipSize=newTip;
    }
}
