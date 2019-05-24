class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(String str: strs){
            char[] chs = str.toCharArray();
            Arrays.sort(chs);
            String key = new String(chs);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        for(String en: map.keySet()){
            List<String> list = map.get(en);
            res.add(new ArrayList<>(list));
        }
        return res;
    }
}