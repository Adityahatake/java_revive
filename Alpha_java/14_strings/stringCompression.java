public class stringCompression {
    public static void string_compression(String str) {
        StringBuilder newstr=new StringBuilder("");

        for(int i=0;i<str.length();i++){
        Integer count=0;
        while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
            count++;
            i++;
        }
        newstr=newstr.append(str.charAt(i));
        if(count>1){
            newstr=newstr.append(count.toString());
        }
       
    }
     newstr.toString();
        System.out.println(newstr);
}
    public static void main(String[] args) {
        System.out.println("Test");
        String str="aaaabccc";
        string_compression(str);
    }
}
