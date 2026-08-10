public class stringCompress {
    public static void main(String[] args) {
        System.out.println("TEST");
        String str="aaabbbcc";
        System.out.println(compression(str));

    }
    public static String compression(String str) {
        String newStr="";
        for(int i=0;i<str.length();i++){
        Integer count =0;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            if(count>1){
                newStr+= count.toString();
            }
        }
        return newStr;
    }

}
