class Solution {
    public int divide(int dividend, int divisor) {
        long symbol = 1;
        if((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)){
            symbol = -1;
        }
        long divid = Math.abs((long)dividend);
        long divis = Math.abs((long)divisor);
        long ans = help(divid, divis);

        if(symbol == 1){
            if(ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        }else {
            if(ans - Integer.MAX_VALUE > 1) return Integer.MAX_VALUE;
        }
        return (int)(symbol*ans);
    }

    public long help(long divid, long divis){
        if(divid < divis) return 0;
        long multi = 1;
        long sum = divis;
        while((sum+sum) < divid){
            sum += sum;
            multi += multi;
        }
        return multi + help(divid - sum, divis);
    }
}