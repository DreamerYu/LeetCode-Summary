Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

### Idea:

two binary search: first find the leftmost and the other find the right most

for example:

1. nums[mid]