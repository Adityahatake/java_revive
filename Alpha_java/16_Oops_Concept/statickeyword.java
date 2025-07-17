// The static keyword is used for 
// variables, methods, or blocks that belong 
// to the class rather than instances(Object).
//  a static method: can be called without creating an object.
// Static members are common to all instances of the class
public class statickeyword {
      public static void main(String[] args) {
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();

        obj1.incrementCount();
        obj2.incrementCount();

        // Accessing static method without object
        StaticExample.displayCount(); // Output: Count is: 2
        //here single count variable is shraed among all the object 
        
    }
}
class StaticExample {
    static int count = 0; // static variable shared across all objects

    // static method
    static void displayCount() {
        System.out.println("Count is: " + count);
    }

    // non-static method
    void incrementCount() {
        count++;
    }

  
}

