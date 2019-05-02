class Solution {
    public int search(ArrayReader reader, int target) {
        if(reader.get(0) == 2147483647 || reader.get(0) > target) return -1;
        int index = 1, preinx = 0;
        while(true){
            if(reader.get(index) < target){
                preinx = index;
                index *= 2;
            }else break;
        }
        return binary(reader, preinx, index, target);
    }

    public int binary(ArrayReader reader, int start, int end, int target){
        int low = start, high = end;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(reader.get(mid) == target) return mid;
            else if(reader.get(mid) < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
}