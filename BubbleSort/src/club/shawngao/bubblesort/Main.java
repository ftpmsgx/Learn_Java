package club.shawngao.bubblesort;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int[] a = new int[10];
    	int i,j,temp;
    	System.out.print("输入十个数:");
    	for(i = 0; i < 10; i++)
    	    a[i] = sc.nextInt();
    	for(i = 0; i < 9; i++)
    	    for(j = 0; j < 9 - i; j++)
    	        if(a[j+1] > a[j]){
    	            temp = a[j+1];
    	            a[j+1] = a[j];
    	            a[j] = temp;
                }
    	System.out.println(Arrays.toString(a));
    }
}
