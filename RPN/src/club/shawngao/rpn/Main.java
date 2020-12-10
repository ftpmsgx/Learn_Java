package club.shawngao.rpn;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String[] s = { "2", "1", "+", "10", "*", "3", "%" }; // 逆波兰式

        String operator = "+-%*/";
        Stack<Double> stack = new Stack<>(); // 栈
        Double a, b;
        int i;
        for (i = 0; i < s.length; i++) {
            if (!operator.contains(s[i]))
                stack.push(Double.parseDouble(s[i]));
            else {
                a = stack.pop();
                b = stack.pop();
                switch (operator.indexOf(s[i])) {
                    case 0:
                        stack.push(a + b);
                        break;
                    case 1:
                        stack.push(a - b);
                        break;
                    case 2:
                        stack.push(a % b);
                        break;
                    case 3:
                        stack.push(a * b);
                        break;
                    case 4:
                        stack.push(a / b);
                        break;
                }
            }
        }
        System.out.println("result = " + stack.pop());
    }
}
