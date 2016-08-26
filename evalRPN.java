public class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> stack = new Stack<>();
        int a,b;
        for (int i = 0; i < tokens.length; i++){
            String tmp = tokens[i];
            switch (tmp){
                case "+":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(a + b);
                    break;
                case "-":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b - a);
                    break;
                case "*":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b * a);
                    break;
                case "/":
                    a = stack.pop();
                    b = stack.pop();
                    if (a == 0){
                        return -1;
                    }
                    stack.push (b / a);
                    break;
                default:
                    stack.push(Integer.parseInt(tmp));
            }
        }
        int result = stack.peek();
        return result;
    }
}