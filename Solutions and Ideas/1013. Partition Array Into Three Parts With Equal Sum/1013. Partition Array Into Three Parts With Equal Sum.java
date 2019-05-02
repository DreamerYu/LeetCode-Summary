class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for(int i : A){
            sum += i;
        }
        if(sum % 3 != 0) return false;
        int part = 0, count = 0;
        for(int a : A){
            part += a;
            if(part == sum / 3){
                part = 0;
                count++;
            }
        }
        return count == 3;
    }
}