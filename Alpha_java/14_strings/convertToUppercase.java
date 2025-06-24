public class convertToUppercase {
    public static void convert_To_Uppercase(String str) {
        StringBuilder sb= new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));     
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        String s1 ="hi i am daksh";
        convert_To_Uppercase(s1);
    }
}
