class Solution {
    public boolean isMatch(String s, String p) {

        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        dp[0][0] = true;
        for(int i = 1; i < p.length()+1; i++){
            if(p.charAt(i-1) != '*') break;
            dp[0][i] = true;
        }
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < p.length(); j++){
                if(p.charAt(j) == '*'){
                    dp[i+1][j+1] = dp[i][j+1]||dp[i+1][j];
                }else if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '?'){
                    dp[i+1][j+1] = dp[i][j];
                }else dp[i+1][j+1] = false;
            }
        }
        return dp[s.length()][p.length()];

    }
}