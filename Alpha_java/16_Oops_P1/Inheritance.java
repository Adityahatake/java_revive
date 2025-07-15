public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Test");
        Animals monkey=new Animals();
        monkey.name="ChimpanzeeniBananini";
        monkey.eats();
        fish shark=new fish();
        shark.name="TralaLeroTralala";
        shark.breaths();
    }
}
class Animals{
    String name;
   void eats(){
        System.out.println( name+" eats");
    }
    void breaths(){
        System.out.println(name+" breaths");
    }
}
class fish extends Animals{
     void swims(){
        System.out.println(name+" swims");
     }
}
