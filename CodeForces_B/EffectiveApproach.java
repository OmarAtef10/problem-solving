package CodeForces_B;

import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Scanner;

public class EffectiveApproach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Hashtable<Integer, Integer> asc = new Hashtable<>();
        Hashtable<Integer, Integer> desc = new Hashtable<>();
        for (int i = 0; i < size; i++) {
            int key = scanner.nextInt();
            asc.put(key, i + 1);
            desc.put(key, size - i);
        }
        int tests = scanner.nextInt();
        int[] query = new int[tests];
        for (int i = 0; i < tests; i++) {
            query[i] = scanner.nextInt();
        }
        long left = 0;
        long right = 0;
        for (int i = 0; i < tests; i++) {
            left += asc.get(query[i]);
            right += desc.get(query[i]);
        }
        System.out.println(left + " " + right);
    }
}
