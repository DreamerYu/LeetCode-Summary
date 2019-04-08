class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> res = new ArrayList<>();

        for(int i = 0; i < queries.length; i++){
            res.add(help(pattern, queries[i]));
        }
        return res;
    }

    public boolean help(String p, String q){
        if(p.length() > q.length()) return false;
        int pinx = 0;

        for(int i = 0; i < q.length(); i++){
            if(pinx >= p.length()){
                if(Character.isUpperCase(q.charAt(i))) return false;
            }else{
                if(p.charAt(pinx) == q.charAt(i)){
                    pinx++;
                }else{
                    if(Character.isUpperCase(q.charAt(i))) return false;
                }
            }
        }

        return pinx == p.length();
    }
}