Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

### Idea:

use the symbol to represent the current sum and if the sum>0 continue, if sum<0, set sum = 0
and every step, get the max num

dp method: use the dp[i] means the largest sum ending with A[i];