### find the left most element in ascending array
```java
int start = 0, end = nums.length -1;
while(start < end){
    int mid = start + (end - start)/2;
    if(nums[mid] >= target){
        end = mid;
    }else{
        start = mid + 1;
    }
}
if(nums[start] != target) balabala
```

### find the right most element in ascending array

we can add a bias to the mid, then the array will come to right most
```java
while(start < end){
    // add the right bias
    int mid = start + (end - start)/2 + 1;
    if(nums[mid] > target){
        end = mid-1;
    }else{
        start = mid;
    }
}
if(nums[start] != target) ...
```