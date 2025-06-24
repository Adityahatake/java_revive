// Define a public class named convertToUppercase
public class convertToUppercase {

    // Static method to convert the first letter of each word in the string to uppercase
    public static void convert_To_Uppercase(String str) {
        // Create a StringBuilder to build the result string
        StringBuilder sb = new StringBuilder("");

        // Convert the first character of the input string to uppercase
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch); // Append the capitalized first character

        // Loop through the rest of the characters in the string
        for (int i = 1; i < str.length(); i++) {
            // If a space is found and it's not the last character
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i)); // Append the space
                i++; // Move to the next character (start of next word)
                // Convert the first character of the new word to uppercase and append
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                // Otherwise, just append the current character as is
                sb.append(str.charAt(i));
            }
        }

        // Print the final modified string
        System.out.println(sb.toString());
    }

    // Main method to test the conversion
    public static void main(String[] args) {
        String s1 = "hi i am daksh"; // Input string
        convert_To_Uppercase(s1);    // Call the method to convert it
    }
}
