Given a collection of intervals, merge all overlapping intervals.

### Idea:
sort the start array and the end array, find the intervals where (start[i+1] > end[i])