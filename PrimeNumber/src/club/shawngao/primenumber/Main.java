package club.shawngao.primenumber;

public class Main {

    public static void main(String[] args) {
        int i;
        for(i = 100; i <= 200; i++) {
            if (isPrimeNumber(i))
                System.out.printf("%5d", i);
        }
        System.out.println(" ");
    }
    private static boolean isPrimeNumber(int n){
        int i;
        boolean flag = true;
        for(i = 2; i < Math.sqrt(n); i++)
            if(n % i == 0){
                flag = false;
                break;
            }
        return flag;
    }
}
