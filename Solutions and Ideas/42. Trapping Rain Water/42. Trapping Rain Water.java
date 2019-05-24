class Solution {
    // space: O(1)
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftmax = 0, rightmax = 0;
        int res = 0;
        while(left <= right){
            leftmax = Math.max(leftmax, height[left]);
            rightmax = Math.max(rightmax, height[right]);
            if(leftmax <= rightmax){
                res += leftmax - height[left];
                left++;
            }else{
                res += rightmax - height[right];
                right--;
            }
        }
        return res;
    }



    // space: O(n)
    public int trap2(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int bar = 0;
        for(int i = 0; i < height.length; i++){
            left[i] = height[i]>=bar? 0:(bar-height[i]);
            bar = Math.max(bar, height[i]);
        }
        bar = 0;
        for(int i = height.length - 1; i >= 0; i--){
            right[i] = height[i]>=bar? 0:(bar-height[i]);
            bar = Math.max(bar, height[i]);
        }
        int res = 0;
        for(int i = 0; i < height.length; i++){
            res += Math.min(left[i], right[i]);
        }
        return res;
    }
}