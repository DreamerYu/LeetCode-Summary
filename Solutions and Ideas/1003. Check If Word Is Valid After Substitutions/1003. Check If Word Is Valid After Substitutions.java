class Solution {
    public boolean isValid2(String S) {
        return isValid(S, 0);
    }

    public boolean isValid(String S, int index){
        if(S.equals("abc")) return true;
        else if(S.length() <= 3) return false;

        for(int i = Math.max(index, 0); i < S.length(); i++){
            if(S.substring(i).startsWith("abc")){
                if(isValid(S.substring(0, i) + S.substring(i + 3), i - 2)) return true;
                else return false;
            }
        }
        return false;
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == 'c') {
                if (stack.isEmpty() || stack.pop() != 'b') return false;
                if (stack.isEmpty() || stack.pop() != 'a') return false;
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}