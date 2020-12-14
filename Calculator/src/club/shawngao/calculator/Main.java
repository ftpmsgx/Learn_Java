package club.shawngao.calculator;

import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();
        ArrayList<String> rpn = new ArrayList<>();
        ArrayList<String> op = new ArrayList<>();
        String str;
        int i;
        System.out.print("Please enter a Formula:");
        while(true) {
            str = sc.next();
            if(str.equals("=")) {
                break;
            }
            al.add(str);
        }
        for(i = 0; i < al.size(); i++) {
            if(al.get(i).equals("(")) {
                op.add(al.get(i));
            }
            if(al.get(i).equals(")")) {
                int j = op.size() - 1;
                while(j >= 0) {
                    if(op.get(j).equals("(")) {
                        j--;
                        continue;
                    }
                    rpn.add(op.get(j));
                    j--;
                }
                op.clear();
            }
            if(al.get(i).equals("*") || al.get(i).equals("/")) {
                op.add(al.get(i));
            }
            if(al.get(i).equals("+") || al.get(i).equals("-")) {
                op.add(al.get(i));
            }
            if(isNumericzidai(al.get(i))) {
                rpn.add(al.get(i));
            }
        }
        for(int j = op.size() - 1; j >= 0; j--) {
            rpn.add(op.get(j));
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

    public static boolean isNumericzidai(String str) {
        String bigStr;
        try {
            bigStr = new BigDecimal(str).toString();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
