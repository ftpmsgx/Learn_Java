package club.shawngao.chartypenumber;

import java.util.*;

public class Main {

    /**
     * 统计字符串内数字、字母以及其他符号的个数
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch;
        System.out.print("Enter a String:");
        ch = sc.next();
        judge(ch);
    }

    /**
     * 开始判断
     */
    public static void judge(String c){
        StringBuilder numS = new StringBuilder();
        StringBuilder charS = new StringBuilder();
        StringBuilder otherS = new StringBuilder();
        char[] array = c.toCharArray();
        int numStr, charStr, otherStr;
        int i;
        numStr = charStr = otherStr = 0;
        for(i = 0; i < array.length; i++){
            if(array[i] >= 48 && array[i] <= 57){
                numStr++;
                numS.append(array[i]);
            }
            else if((array[i] >= 65 && array[i] <= 90)||(array[i] >= 97 && array[i] <= 122)){
                charStr++;
                charS.append(array[i]);
            }
            else{
                otherStr++;
                otherS.append(array[i]);
            }
        }
        System.out.println("数字个数：" + numStr);
        System.out.println("数字包含：" + numS.toString());
        System.out.println("字母个数：" + charStr);
        System.out.println("字母包含：" + charS.toString());
        System.out.println("其他个数：" + otherStr);
        System.out.println("其他包含：" + otherS.toString());
    }
}
