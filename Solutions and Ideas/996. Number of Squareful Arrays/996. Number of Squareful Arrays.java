class Solution {
    int count = 0;
    public int numSquarefulPerms(int[] A) {
        Arrays.sort(A);
        help(new ArrayList<>(), A, new boolean[A.length], -1);
        return count;

    }

    public void help(List<Integer> list, int[] A, boolean[] used, int lastnum){
        if(list.size() == A.length){
            count++;
            return;
        }

        for(int i = 0; i < A.length; i++){
            if(used[i] || (i > 0 && !used[i - 1] && A[i] == A[i - 1])){
                continue;
            }
            if(lastnum != -1){
                if(!square(A[i], lastnum)){
                    continue;
                }
            }
            list.add(A[i]);
            used[i] = true;
            help(list, A, used, A[i]);
            used[i] = false;
            list.remove(list.size() - 1);
        }
    }

    public boolean square(int a, int b){
        int sqr = (int)Math.sqrt(a + b);
        return (sqr*sqr - a - b) == 0;
    }
}