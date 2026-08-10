public class leetterToUppercase {
    public static void main(String[] args) {
        System.out.println("Letter to uppercase");
        String str="hi my name is daksh";
        String str2="woww iss that through";
        FLTU(str2);
    }
    public static void FLTU(String str) {
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }

        }
        System.out.println(sb);
    }
}
