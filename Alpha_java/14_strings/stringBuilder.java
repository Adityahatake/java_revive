public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("");
        for(char i='a';i<='z';i++){
            sb.append(i); //TC: O(26) , if used String then O(26*n^2)
        }
        System.out.println(sb);
        System.out.println("lenght the above StringBuilder sb is: "+sb.length());
    }
    
}
