package club.shawngao.lcp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] strs = new String[]{"flower","flow","flight"};
        if (strs == null || strs.length == 0) {
            return;
        }
        if (strs.length == 1) {
            return;
        }
        ArrayList<ArrayList<Character>> chs = new ArrayList<>();
        ArrayList<Integer> cnt = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            ArrayList<Character> CTmp = new ArrayList<>();
            for (int j = 0; j < strs[i].length(); j++) {
                Character Temp = strs[i].charAt(j);
                CTmp.add(Temp);
            }
            chs.add(CTmp);
            cnt.add(CTmp.size());
        }
        Collections.sort(cnt);
        String Lcp = "";
        Boolean flag = false;
        for (int i = 0; i < cnt.get(0); i++) {
            flag = false;
            for (int j = 0; j < chs.size() - 1; j++) {
                if (chs.get(j).get(i) == chs.get(j + 1).get(i)) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                Lcp += chs.get(0).get(i);
            } else {
                break;
            }
        }
        System.out.println(Lcp);
    }
}
