class Solution {
    public void nextPermutation(int[] nums) {
        int index = nums.length - 1;
        while(index > 0 && nums[index] <= nums[index - 1]) index--;
        if(index == 0){
            Arrays.sort(nums, index, nums.length);
        }else{
            int min = Integer.MAX_VALUE;
            int ninx = 0;
            for(int i = index; i < nums.length; i++){
                if(nums[i] > nums[index-1]){
                    if(min > nums[i]){
                        min = nums[i];
                        ninx = i;
                    }
                }
            }
            swap(nums, ninx, index-1);
            Arrays.sort(nums, index, nums.length);
        }
    }

    public void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

}