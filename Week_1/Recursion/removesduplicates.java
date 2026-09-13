public class removesduplicates {
    public static void main(String[] args) {
        System.out.println("remove any duplicate charaters fro  the given string");
        String a="apnacollege";
        Rdup(a, 0, new StringBuilder(""), new boolean[26]);
    }
    public static void Rdup(String str ,int idx , StringBuilder newstr , boolean map[]) {
        //base case
        if(idx==str.length()){
            System.out.println(newstr);
            return ;
        }
        
        //kaam(recursion)
        char currChar =str.charAt(idx);
        if (map[currChar-'a']==true) {
            //duplicate 
            Rdup(str, idx+1, newstr, map);
            
        }else{
            map[currChar-'a']=true;
            Rdup(str, idx+1, newstr.append(currChar), map);
        }
    }
}
