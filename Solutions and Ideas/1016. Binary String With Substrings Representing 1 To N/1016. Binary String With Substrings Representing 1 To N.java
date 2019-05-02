class Solution {

    /*
        can use the "for (int i = N; i > N / 2; --i)"
        because if N is contained, the N/2 will be the prefix of N, it will be contained, too.
    */

    public boolean queryString(String S, int N) {

        for(int i = 0; i <= N; i++){
            String st = base2(i);
            boolean thisst = false;
            for(int j = 0; j < S.length(); j++){
                if(S.substring(j).startsWith(st)){
                    thisst = true;
                    break;
                }
            }
            if(!thisst) return false;
        }
        return true;
    }

    public String base2(int i){
        String res = "";
        while(i != 0){
            res = (i&1) + res;
            i = i>>1;
        }
        return res == "" ? "0" : res;
    }
}