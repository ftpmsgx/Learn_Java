package club.shawngao.calculator;

import java.math.BigDecimal;
import java.util.*;

/**
 * 计算器
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         *  动态数组的定义
         *  al数组用来输入原始算式，即中缀表达式
         *  rpn数组用来存放逆波兰式
         *  op数组用来存放操作符
         */
        ArrayList<String> al = new ArrayList<>();
        ArrayList<String> rpn = new ArrayList<>();
        ArrayList<String> op = new ArrayList<>();
        // numTmp 存放临时的数字字符, opTmp即存放临时的操作符
        String str, numTmp = "", opTmp = "";
        int i;
        // 此处输入原始算式，并以等号为结束符
        System.out.print("Please enter a Formula:");
        str = sc.nextLine();
        if(str.length() <= 1) {
            System.out.println("\033[31m你不能只输入1个符号或者数字!");
            return;
        }
        // 用来取出字符串中的单个字符
        char s;
        for(int w = 0; w < str.length(); w++) {
             s = str.charAt(w);
             // 如果s存放的是数字，则需要在opTmp处于非空的情况下清空，且需要将操作符之间的数字链接起来（主要用于多位数）
             if(s >= '0' && s <= '9') {
                 if(!opTmp.equals("")) {
                     opTmp = "";
                 }
                 numTmp += s;
             }
             // 如果s中存放的不是数字，则需要在numTmp处于非空的状态下追加到al字符串动态数组的后方，并清空
             // 判断s是否存放的是等号，如果是，则跳出，即标志为算式的结束
             // 判断s存放的是否为"回括号"，如果是，则将s存入opTmp中，再将opTmp追加到al字符串动态数组的后方
             // 其余的情况，则将s存入opTmp中，再将opTmp追加到al字符串动态数组的后方
             if(!(s >= '0' && s <= '9') || s == '=') {
                 if(!numTmp.equals("")) {
                     al.add(numTmp);
                     numTmp = "";
                 }
                 if(s == '=') {
                     break;
                 } else if(s == ')' || s == '）'){
                     opTmp = s + "";
                     al.add(opTmp);
                 } else {
                     opTmp = s + "";
                     al.add(opTmp);
                 }
             }
        }
        System.out.println(al);
        // 中缀表达式转换逆波兰式
        for(i = 0; i < al.size(); i++) {
            if(al.get(i).equals("(") || al.get(i).equals("（")) {
                op.add(al.get(i));
                continue;
            }
            if(al.get(i).equals(")") || al.get(i).equals("）")) {
                int j = op.size() - 1;
                while(j >= 0) {
                    if(op.get(j).equals("(") || op.get(j).equals("（")) {
                        j--;
                        continue;
                    }
                    rpn.add(op.get(j));
                    j--;
                }
                op.clear();
                continue;
            }
            if(al.get(i).equals("*") || al.get(i).equals("/") || al.get(i).equals("%")) {
                op.add(al.get(i));
                continue;
            }
            if(al.get(i).equals("+") || al.get(i).equals("-")) {
                op.add(al.get(i));
                continue;
            }
            if(isNumericzidai(al.get(i))) {
                rpn.add(al.get(i));
            }
        }
        for(int j = op.size() - 1; j >= 0; j--) {
            rpn.add(op.get(j));
        }
        // 对逆波兰式进行解析运算
        String operator = "+-%*/";
        Stack<Double> stack = new Stack<>(); // 栈
        Double a, b;
        for (i = 0; i < rpn.size(); i++) {
            if (!operator.contains(rpn.get(i))) {
                stack.push(Double.parseDouble(rpn.get(i)));
            } else {
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
                        stack.push(b % a);
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
        System.out.println("\033[32mResult = " + stack.pop());
    }

    /**
     * 判断是否为数字，不是则会抛出异常
     * @param str   参数
     * @return  返回逻辑值
     */
    public static boolean isNumericzidai(String str) {
        String bigStr;
        try {
            bigStr = new BigDecimal(str).toString();
        } catch (Exception e) {
            System.out.println("\033[31m 哦，糟糕，字符:" + "\"" + str + "\"" + "发生了异常 :(");
            System.out.println("异常：" + e);
            System.out.println("\033[31m你可能输入了错误的东西~    :D");
            return false;
        }
        System.out.println("\033[32m" + bigStr + "已正常处理  :)");
        return true;
    }
}
