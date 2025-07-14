public class Oops_Intro {
    public static void main(String[] args){
        Pen P1=new Pen();
        P1.setColor("pink");
        System.out.println(P1.color);
        P1.setTip(3);
        System.out.println(P1.tipSize);
        BankAccount daksh=new BankAccount();
        daksh.username="sigmaDaksh";
        daksh.setpw("strongpw");
        System.out.println(daksh.username);
        daksh.getpw();
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
class BankAccount{
    public String username;
    private String password;
    void setpw(String pw){
        password=pw;
    }
    void getpw(){
        System.out.println(password);
    }
}
