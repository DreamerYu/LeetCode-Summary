Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

The replacement must be in-place and use only constant extra memory.

Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.

1,2,3 → 1,3,2

3,2,1 → 1,2,3

1,1,5 → 1,5,1


1 2 3 4 5
1 2 3 5 4
1 2 4 3 5
1 2 4 5 3

### Idea:

Try to find the law between current permutation and next permutation

Law: from the tail of nums, find the the first number which does not satisfy nums[i] <= nums[i-1]
, then exchange the i-1 and the next number in this list of asending numbers. At last, sort all this list of numbers.