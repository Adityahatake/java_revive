public class r_dulpicateString {
    public static void main(String[] args) {
       String name ="aadityaaadaksh";
       removeDuplicates(name, 0, new StringBuilder(), new boolean[26]);
        
    }
    public static void removeDuplicates(String str , int idx , StringBuilder newstr, boolean map[]) {
        if(idx==str.length()){ //base case
            System.out.println(newstr);
            return;
        }
        //kaam
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            //duplicate
            removeDuplicates(str, idx+1, newstr, map);
        }else{
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, newstr.append(currChar), map);
        }
        
    }
}
