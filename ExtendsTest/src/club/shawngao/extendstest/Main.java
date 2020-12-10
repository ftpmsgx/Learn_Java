package club.shawngao.extendstest;

import java.util.Scanner;

class Sum {
    public int Su(int a, int b) {
        int s;
        s = a + b;
        return s;
    }
}
public class Main extends Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sum s1 = new Sum();
        System.out.println(s1.Su(sc.nextInt(),sc.nextInt()));
    }
}
