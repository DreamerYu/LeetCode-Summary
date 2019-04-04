class Solution {
    /* first, think about base 2
        change a base10 int into base2 and get every num from right to left

        Then if base-2
        It's mostly implementation defined. and most compilers choose to preserve the sign by setting the most significant bits after the shift.
for example, -3 in 8-bit is 11111101 and -3>>1 is 11111110, which is -2. (round towards -inf)
this is different from -3/2, which is -1. (round towards 0)
same goes -3>>2 == -1 and -3/4 == 0.
    */
    public String baseNeg2(int N) {
        if(N == 0) return "0";
        StringBuilder sb = new StringBuilder();

        while(N != 0){
            sb.append((N & 1) == 1? "1" : "0");
            N = -(N>>1);
        }
        return sb.reverse().toString();
    }
}