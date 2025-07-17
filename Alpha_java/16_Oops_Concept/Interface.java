public class Interface {
    public static void main(String[] args) {
        king whiteking = new king();
        whiteking.moves();
    }
}

interface chessPeices {
    void moves();
}

class queen implements chessPeices {
    public void moves() {
        System.out.println("up,down,left,right,diagonal(in all directions)");
    }
}

class Rook implements chessPeices {
    public void moves() {
        System.out.println("up,down,left,right");
    }
}

class bishop implements chessPeices {
    public void moves() {
        System.out.println("diagonal(in all directions)");
    }
}

class knight implements chessPeices {
    public void moves() {
        System.out.println("L banakar chalta h");
    }
}

class king implements chessPeices {
    public void moves() {
        System.out.println("(in all possible directions by one step)");
    }
}