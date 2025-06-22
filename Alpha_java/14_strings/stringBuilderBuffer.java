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
        
    }
    
}
