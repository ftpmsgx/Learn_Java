package club.shawngao.rpn;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> rpn = new ArrayList<>();
        String str;
        int i;
        System.out.print("Please enter a RPN:");
        while (true) {
            str = sc.next();
            if (str.equals("#")) {
                break;
            }
            rpn.add(str);
        }
        String operator = "+-%*/";
        Stack<Double> stack = new Stack<>(); // 栈
        Double a, b;
        for (i = 0; i < rpn.size(); i++) {
            if (!operator.contains(rpn.get(i)))
                stack.push(Double.parseDouble(rpn.get(i)));
            else {
                a = stack.pop();
                b = stack.pop();
                switch (operator.indexOf(rpn.get(i))) {
                    case 0:
                        stack.push(a + b);
                        break;
                    case 1:
                        stack.push(b - a);
                        break;
                    case 2:
                        stack.push(a % b);
                        break;
                    case 3:
                        stack.push(a * b);
                        break;
                    case 4:
                        stack.push(b / a);
                        break;
                }
            }
        }
        System.out.println("result = " + stack.pop());
    }
}

