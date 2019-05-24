class Solution {
    // be careful about the edge of the Integer
    public double myPow(double x, int N) {
        long n = (long)N;
        if(n < 0){
            x = 1/x;
            n = -n;
        }
        if(n == 0) return (double)1;
        return help(x, n);
    }

    public double help(double x, long n){
        if(n == 0) return (double)1;
        if(n == 1) return x;
        long power = 1;
        double res = x;
        while(power*2 <= n){
            res = res * res;
            power = power*2;
        }
        return res*help(x, n-power);
    }
}