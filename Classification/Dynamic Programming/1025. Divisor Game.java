class Solution {
    HashMap<Integer, Boolean> map = new HashMap<>();
    public boolean divisorGame(int N) {
        if(map.containsKey(N)) return map.get(N);
        if(N <= 1) return false;

        for(int i = N / 2; i > 0; i--){
            if(N % i == 0){
                if(!helpbob(N - i)){
                    map.put(N, true);
                    return true;
                }
            }
        }
        map.put(N, false);
        return false;
    }

    public boolean helpbob(int N) {
        if(map.containsKey(N)) return map.get(N);
        if(N <= 1) return false;

        for(int i = N / 2; i > 0; i--){
            if(N % i == 0){
                if(!divisorGame(N - i)){
                    map.put(N, true);
                    return true;
                }
            }
        }
        map.put(N, false);
        return false;
    }
}