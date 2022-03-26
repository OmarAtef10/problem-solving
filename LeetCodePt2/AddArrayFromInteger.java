package LeetCodePt2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddArrayFromInteger {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = num.length;
        int cur = k;
        while (--i >= 0 || cur > 0) {
            if (i >= 0) {
                cur += num[i];
            }
            res.add(cur%10);
            cur /= 10;
        }

        Collections.reverse(res);
        return res;
    }
}
