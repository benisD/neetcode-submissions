class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<Character>();
        for(char c:s.toCharArray()) {
            if(stack.isEmpty()) {
                stack.push(c);
            } else {
                if(((stack.peek() == '(') && (c == ')')) || ((stack.peek() == '{') && (c == '}')) || ((stack.peek() == '[') && (c == ']'))) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        if(stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
