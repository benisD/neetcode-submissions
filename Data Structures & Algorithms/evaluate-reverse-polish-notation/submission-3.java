class Solution {
    public int evalRPN(String[] tokens) {
        int size = tokens.length;
        int n = 0;
        Deque<Integer> stacky = new ArrayDeque<Integer>();
        int a, b;
        while(n < size) {
            switch(tokens[n]) {
                case "+":
                a = stacky.pop();
                b = stacky.pop();
                stacky.push(b + a);
                break;
                case "-":
                a = stacky.pop();
                b = stacky.pop();
                stacky.push(b - a);
                break;
                case "*":
                a = stacky.pop();
                b = stacky.pop();
                stacky.push(b * a);
                break;
                case "/":
                a = stacky.pop();
                b = stacky.pop();
                stacky.push(b / a);
                break;
                default:
                stacky.push(Integer.parseInt(tokens[n]));
            }
            n++;
        }
        return stacky.pop();
    }
}