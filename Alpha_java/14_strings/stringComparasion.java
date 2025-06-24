public class stringComparasion {
    public static void main(String[] args) {
        String s1= "tony";
        String s2= "tony";
        String s3= new String("tony");
        System.out.println(s1==s2); //true
        System.out.println(s1==s3); //false
        System.out.println(s1.equals(s3)); //preffered way to compare if the inside content of the string are same 

    }
    
}
