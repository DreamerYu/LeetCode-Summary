class Solution {

    public List<String> commonChars(String[] A) {

        int[] res = new int[26];
        List<String> result = new ArrayList<>();
        Arrays.fill(res, Integer.MAX_VALUE);
        for(int i = 0; i < A.length; i++){
            String str = A[i];
            int[] ctr = new int[26];
            for(int j = 0; j < str.length(); j++){
                ctr[str.charAt(j) - 'a']++;
            }

            for(int j = 0; j < 26; j++){
                if(ctr[j] < res[j]) res[j] = ctr[j];
            }
        }

        for(int i = 0; i < 26; i++){
            if(res[i] != Integer.MAX_VALUE){
                for(int j = 0; j < res[i]; j++) result.add(Character.toString((char)('a' + i)));
            }
        }
        return result;
    }
}