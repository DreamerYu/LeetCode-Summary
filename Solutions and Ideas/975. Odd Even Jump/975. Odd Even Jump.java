class Solution {
    public int oddEvenJumps(int[] A) {
        if(A == null || A.length == 0) return 0;
        TreeMap<Integer, Integer> treemap = new TreeMap<>();
        boolean[] dpodd = new boolean[A.length], dpeven = new boolean[A.length];
        dpodd[A.length - 1] = true;
        dpeven[A.length - 1] = true;
        treemap.put(A[A.length - 1], A.length - 1);
        int res = 1;
        for(int i = A.length - 2; i >= 0; i--){
            Map.Entry odd = treemap.ceilingEntry(A[i]), even = treemap.floorEntry(A[i]);
            if(odd != null) dpodd[i] = dpeven[(int)odd.getValue()];
            if(even != null) dpeven[i] = dpodd[(int)even.getValue()];
            if(dpodd[i]) res++;
            treemap.put(A[i], i);
        }
        return res;
    }
}