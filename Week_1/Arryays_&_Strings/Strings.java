public class Strings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Java");
        System.out.println(str1);
        System.out.println(str2);

        String s = "Hello, Java!";
        System.out.println(s.length()); // Output: 12
        System.out.println(s.toUpperCase()); // HELLO, JAVA!
        System.out.println(s.substring(7)); // Java!
        System.out.println(s.contains("Java")); // true

//string builder for efficient string manipulation
        StringBuilder sb = new StringBuilder("Hello");
sb.append(" Java");
System.out.println(sb); // Output: Hello Java


    }

}
