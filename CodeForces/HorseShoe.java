package CodeForces;

import java.util.Hashtable;
import java.util.Scanner;

public class HorseShoe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] rest = new int[4];
        for (int i = 0; i < 4; i++) {
            rest[i] = in.nextInt();
        }
        in.close();
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for (Integer num : rest) {
            if (hashtable.containsKey(num)) {
                int counter = hashtable.get(num);
                counter++;
                hashtable.remove(num);
                hashtable.put(num, counter);
            } else {
                hashtable.put(num, 0);
            }
        }

        int res = 0;
        for (Integer num : hashtable.keySet()) {
            res += hashtable.get(num);
        }
        System.out.println(res);

    }
}
