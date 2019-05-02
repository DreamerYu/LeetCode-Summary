class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int[] x = new int[]{a, b, c};
        Arrays.sort(x);
        a = x[0];
        b = x[1];
        c = x[2];

        int min = 0, max = 0;
        if(a < b-1)
            max = b-1-a;
        if(b+1 < c)
            max += c-(b+1);

        if(b-a == 2 || c-b == 2)
            min = 1;
        else{
            if(b-a > 2)
                min++;
            if(c-b > 2)
                min++;
        }
        return new int[]{min, max};
    }
}