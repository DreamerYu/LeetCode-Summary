class Solution {

    public int[] twoSum2(int[] nums, int target) {
        if (nums.length < 2 || nums == null){
            return new int[]{-1, -1};
        }
        Arrays.sort(nums);
        int[] res = new int[]{-1, -1};
        int low = 0, high = nums.length - 1;
        while (low < high){
            if (nums[low] + nums[high] == target){
                res[0] = low;
                res[1] = high;
                low++;
                high--;
            }else if (nums[low] + nums[high] < target){
                low++;
            }else high--;
        }
        return res;

    }

    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length == 0) return new int[]{-1, -1};

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }else map.put(target - nums[i], i);
        }
        return new int[]{-1, -1};
    }
}