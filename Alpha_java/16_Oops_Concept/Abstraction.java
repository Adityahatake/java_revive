public class Abstraction {
    public static void main(String[] args) {
        // Janwar a=new Janwar(); //cannot create an instance(object) of abstract class
        Horse h = new Horse();
        Chicken c = new Chicken();
        h.walks();
        c.walks();
        Mustang m1=new Mustang();
        m1.walks();
    }
}

abstract class Janwar {
    Janwar(){
        System.out.println("Janwar aaliya!");
    }
    void eats() {
        System.out.println("Janwar eats");
    }

    abstract void walks();
}

class Horse extends Janwar {
    Horse(){
        System.out.println("godha aaliya");
    }
    void walks() {
        System.out.println("walks on 4 legs");
    }
}
class Mustang extends Horse {
    Mustang(){
        System.out.println("premium godha aaliya");
    }
    
}
class Chicken extends Janwar {
    Chicken(){
        System.out.println("Chicken aaliya");
    }
    void walks() {
        System.out.println("walks on 2 legs");
    }
}