class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<>();
        dfs(candidates, target, 0, 0, new ArrayList<>());
        return res;
    }

    public void dfs(int[] candidates, int target, int index, int sum, List<Integer> list){
        if(target == sum){
            res.add(new ArrayList<>(list));
            return;
        }else if(target < sum) return;
        for(int i = index; i < candidates.length; i++){
            list.add(candidates[i]);
            dfs(candidates, target, i, sum + candidates[i], list);
            list.remove(list.size() - 1);
        }
    }
}