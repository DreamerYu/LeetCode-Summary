// class Solution {
//     // stack
//     public int longestValidParentheses(String s) {
//         Stack<Integer> stack = new Stack<>();
//         stack.push(-1);
//         int res = 0;
//         for(int i = 0; i < s.length(); i++){
//             if(s.charAt(i) == '('){
//                 stack.push(i);
//             }else{
//                 stack.pop();
//                 if(!stack.isEmpty()){
//                     res = Math.max(res, i - stack.peek());
//                 }else stack.push(i);
//             }
//         }
//         return res;
//     }
//     // dp
// }

public class Solution {
    public int longestValidParentheses(String s) {
        int left = 0, right = 0, maxlength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxlength = Math.max(maxlength, 2 * right);
            } else if (right >= left) {
                left = right = 0;
            }
        }
        left = right = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxlength = Math.max(maxlength, 2 * left);
            } else if (left >= right) {
                left = right = 0;
            }
        }
        return maxlength;
    }
}