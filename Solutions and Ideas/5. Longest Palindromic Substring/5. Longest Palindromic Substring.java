class Solution {

    // dp function !!! be careful
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return s;
        boolean dp[][] = new boolean[s.length()][s.length()];
        String res = "";
        int max = 0;
        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j <= i; j++){
                dp[i][j] = s.charAt(i) == s.charAt(j) && (i - j <= 2 || dp[i - 1][j + 1]);
                if (i - j + 1 > max && dp[i][j]){
                    max = i - j + 1;
                    res = s.substring(j, i + 1);
                }
            }
        }
        return res;
    }

    // from core to eage
    public String longestPalindrome1(String s) {
        if(s == null || s.length() == 0) return "";
        String res = "", temp = "";
        for(int i = 0; i < s.length(); i++){
            temp = help(s, i, i);
            if(res.length() < temp.length()){
                res = temp;
            }
            temp = help(s, i, i + 1);
            if(res.length() < temp.length()){
                res = temp;
            }
        }
        return res;
    }

    public String help(String s, int x, int y){
        while(x >= 0 && y <= s.length() - 1 && s.charAt(x) == s.charAt(y)){
            x--;
            y++;
        }
        return s.substring(x+1, y);
    }

    // scan all sitruations
    public String longestPalindrome2(String s) {
        if(s == null || s.length() == 0) return "";

        int len = 0;
        String res = "";
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                if(ispalin(s, i, j)){
                    if(len < j - i + 1){
                        res = s.substring(i, j + 1);
                        len = j - i + 1;
                    }
                }
            }
        }
        return res;

    }

    public boolean ispalin(String s, int x, int y){
        while(x < y){
            if(s.charAt(x++) != s.charAt(y--)) return false;
        }
        return true;
    }
}