public class multiple_inheritance_using_interfaces {
    public static void main(String[] args) {
        beer b=new beer();
        b.eats();
    }
}
interface herbivore {
    void eats();
}
interface carnivore {
    void eats();
}
class beer implements herbivore , carnivore{
   public void eats(){
        System.out.println("eats both herbivore and carnivore diet");
    }
}