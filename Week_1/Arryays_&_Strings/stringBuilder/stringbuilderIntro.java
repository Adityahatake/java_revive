public class stringbuilderIntro {
    public static void main(String[] args) {
        System.out.println("Stringbuilder Introduction: ");
        StringBuilder sb=new StringBuilder("Aditya");
        sb.append(" Daksh");
        System.out.println(sb);
        StringBuilder sb1=new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb1.append(ch);
        }
        System.out.println(sb1);


    }
}
