class Solution {
    public String removeOuterParentheses(String S) {

        int leftnum = 0, rightnum = 0;
        int pre = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == '(') leftnum++;
            else rightnum++;
            if(rightnum == leftnum){
                sb.append(S.substring(pre + 1, i));
                pre = i + 1;
            }
        }
        return sb.toString();
    }
}