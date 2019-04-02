class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0;
        int start = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                start = Math.max(start, map.get(ch) + 1);
            }
            map.put(ch, i);
            res = Math.max(res, i - start + 1);
        }
        return res;

    }
}