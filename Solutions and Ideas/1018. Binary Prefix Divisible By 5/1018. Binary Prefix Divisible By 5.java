class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> res = new ArrayList<>();
        if(A == null || A.length == 0) return res;

        int num = 0;
        for(int i = 0; i < A.length; i++){
            num = num * 2 + A[i];
            if(num % 5 == 0) res.add(true);
            else res.add(false);
            num = num % 5;
        }
        return res;
    }
}