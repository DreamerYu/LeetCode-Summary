class Solution {
    public int minAddToMakeValid(String S) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < S.length(); i++){
            char ch = S.charAt(i);
            if(ch == '('){
                stack.push(ch);
            }else if(!stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        return stack.size();
    }
}