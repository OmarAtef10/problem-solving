import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class maxWealth {
    public int maximumWealth(int[][] accounts) {

        Set<Integer> calc = new HashSet<>();

        int sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            calc.add(sum);
            sum = 0;
        }
        int max =-1;
        for (Integer i : calc){
            if (i>max){
                max=i;
            }
        }
        return max;
    }


}
