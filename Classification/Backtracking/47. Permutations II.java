class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        help(nums, new ArrayList<>(), new boolean[nums.length]);
        return res;
    }

    public void help(int[] nums, List<Integer> list, boolean[] visited){
        if(nums.length == list.size()){
            res.add(new ArrayList<>(list));
        }else{
            for(int i = 0; i < nums.length; i++){
                if(visited[i]) continue;
                if(i > 0 && nums[i] == nums[i - 1] && !visited[i-1]) continue;
                else{
                    list.add(nums[i]);
                    visited[i] = true;
                    help(nums, list, visited);
                    list.remove(list.size() - 1);
                    visited[i] = false;
                }
            }
        }
    }
}