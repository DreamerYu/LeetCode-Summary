class Solution {
    public String multiply(String num1, String num2) {

        int m = num1.length(), n = num2.length();
        int carry = 0;
        int[] res = new int[m+n];
        StringBuilder sb = new StringBuilder();
        for(int i = m-1; i >= 0; i--){
            for(int j = n-1; j >= 0; j--){
                int mul = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int sum = mul + res[i+j+1];
                res[i+j] += sum/10;
                res[i+j+1] = sum%10;
            }
        }
        for(int p : res){
            if(!(sb.length() == 0 && p == 0)) sb.append(p);
        }
        return sb.length() == 0? "0" : sb.toString();
    }
}