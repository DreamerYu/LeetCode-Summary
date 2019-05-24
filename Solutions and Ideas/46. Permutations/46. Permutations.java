class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backt(nums, new ArrayList<>());
        return res;
    }

    public void backt(int[] nums, List<Integer> list){
        if(list.size() == nums.length){
            res.add(new ArrayList<Integer>(list));
            return;
        }else{
            for(int i = 0; i < nums.length; i++){
                if(list.contains(nums[i])) continue;
                else{
                    list.add(nums[i]);
                    backt(nums, list);
                    list.remove(list.size() - 1);
                }
            }
        }
    }
}