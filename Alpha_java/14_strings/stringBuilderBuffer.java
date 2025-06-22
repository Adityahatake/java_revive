// Unlike String, both StringBuilder and StringBuffer are mutable — you can modify them without creating a new object every time.
// Use them when you're doing many string operations (like appending in loops).
public class stringBuilderBuffer {
    public static void main(String[] args) {
        //creating a string builder
        StringBuilder sb=new StringBuilder("Be Aware");
        sb.append(" of Gti");
        System.out.println("String sb: " +sb);
        //creating a string buffer
        StringBuffer sbf=new StringBuffer("focus on yourself");
        sbf.insert(17, " bro ");
        System.out.println("String sbf: "+sbf);

                  // Replace and delete
        sb.replace(0, 5, "Hi");
        sbf.delete(4, 15);
        System.out.println("Modified StringBuilder: " + sb);
        System.out.println("Modified StringBuffer: " + sbf);
    }
    
}

// Feature	   | StringBuilder	   |  StringBuffer
// Thread-safe?| No	               |  Yes (synchronized)
// Performance | Faster	           |  Slower (due to sync)
// Use-case    |Single-thread apps | Multi-thread apps
