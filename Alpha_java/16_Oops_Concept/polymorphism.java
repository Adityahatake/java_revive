public class polymorphism {
    public static void main(String[] args) {
        Add s1=new Add();
        System.out.println(s1.sum(12, 18));
        System.out.println(s1.sum((float)2.1, (float)1.9));
        System.out.println(s1.sum(12,13,15));
        cow c1=new cow();
        c1.eats(); //method overriding (dynamic/runtime polymorphism)
    }
}
class Add{ //method overloading , (static/compileTime polymorphism)
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a , int b, int c){
        return a+b+c;
    }
}
class Animals{
      void eats(){
        System.out.println( "eats anything");
    }
    void breaths(){
        System.out.println("breaths");
    }
}
class cow extends Animals{
     void eats(){
        System.out.println( "eats Grass");
    }
}
