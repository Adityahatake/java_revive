public class Abstraction {
    public static void main(String[] args) {
        // Janwar a=new Janwar(); //cannot create an instance(object) of abstract class
        Horse h = new Horse();
        Chicken c = new Chicken();
        h.walks();
        c.walks();

    }
}

abstract class Janwar {
    void eats() {
        System.out.println("Janwar eats");
    }

    abstract void walks();
}

class Horse extends Janwar {
    void walks() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Janwar {
    void walks() {
        System.out.println("walks on 2 legs");
    }
}