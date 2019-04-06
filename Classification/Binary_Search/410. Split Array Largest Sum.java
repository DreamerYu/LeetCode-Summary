class Solution {
    public int splitArray(int[] nums, int m) {
        if(nums == null || nums.length == 0) return 0;

        int left = 0, right = 0;
        for(int num : nums){
            left = Math.max(left, num);
            right += num;
        }

        while(left < right){
            int mid = left + (right - left) / 2, need = 1, cur = 0;
            for(int num : nums){
                if(cur + num > mid){
                    need++;
                    cur = 0;
                }
                cur += num;
            }
            if(need > m) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}