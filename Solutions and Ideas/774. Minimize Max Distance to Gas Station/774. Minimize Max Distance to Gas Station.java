class Solution {
    /*
    To understand this solution, you need to ask yourself these questions.


    1. what does mid mean? The variable mid here is actually a guess of the result, for example, we guess the Max Distance is 1.3.

    2. with this guess, how many gas stations we need? There are several situations,
    For example, mid = 1.3, arr = [1,2,4,8]
    how many gas stations between 1 and 2? 0,
    how many gas stations we need between 2 and 4? math.ceil((b - a) / mid) - 1 = ceil((4-2)/1.3) - 1 = 1
    how many gas stations we need between 4 and 8? ceil((8-4)/1.3) - 1 = 3

    3. what should we do if we don't have enough K?
    Increase our guess, so we will need less extra gas stations. For example, if we guess the Max   Distance is 2.1, we only need K = 1

    After that, shrink the range until it's accurate enough.
    */
    public double minmaxGasDist(int[] stations, int K) {
        int count, N = stations.length;
        double left = 0, right = stations[N - 1] - stations[0], mid;

        while (left +1e-6 < right) {
            mid = (left + right) / 2;
            count = 0;
            for (int i = 0; i < N - 1; ++i)
                count += Math.ceil((stations[i + 1] - stations[i]) / mid) - 1;
            if (count > K) left = mid;
            else right = mid;
        }
        return right;

    }
}