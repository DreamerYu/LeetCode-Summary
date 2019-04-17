class Solution {
    public int findJudge(int N, int[][] trust) {

        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();

        for(int i = 1; i <= N; i++){
            map.put(i, new HashSet<>());
        }

        for(int i = 0; i < trust.length; i++){
            map.get(trust[i][0]).add(trust[i][1]);
        }

        int judge = -1;
        for(int key : map.keySet()){
            if(map.get(key).isEmpty()){
                if(judge != -1) return -1;
                judge = key;
            }
        }

        for(int key : map.keySet()){
            if(key != judge){
                if(!map.get(key).contains(judge)) return -1;
            }
        }
        return judge;

    }
}