import java.util.Arrays;

public class LT71 {
class Solution {

    int[][] dp;

    public int minDistance(String word1, String word2) {

        dp = new int[word1.length()][word2.length()];

        for(int[] row : dp)
            Arrays.fill(row,-1);

        return solve(0,0,word1,word2);
    }

    int solve(int i,int j,String a,String b){

        if(i==a.length())
            return b.length()-j;

        if(j==b.length())
            return a.length()-i;

        if(dp[i][j]!=-1)
            return dp[i][j];

        if(a.charAt(i)==b.charAt(j))
            return dp[i][j]=solve(i+1,j+1,a,b);

        int insert = solve(i,j+1,a,b);

        int delete = solve(i+1,j,a,b);

        int replace = solve(i+1,j+1,a,b);

        return dp[i][j]=1+Math.min(insert,
                    Math.min(delete,replace));
    }
}
    
}