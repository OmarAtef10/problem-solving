package CodeForces_B;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;

public class PetyaAndCountryside {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = -1;
        int[] roofs = new int[n];
        for (int i = 0; i < n; i++) {
            int next = scanner.nextInt();
            max = Math.max(max, next);
            roofs[i] = next;
        }
        int counter = 1;
        int maxCounter = -1;
        int currentIndex = 0;
        while (currentIndex < n) {
            int roof = roofs[currentIndex];
            int initRoof = roof;
            for (int i = currentIndex + 1; i < n; i++) {
                if (roof >= roofs[i]) {
                    counter++;
                    roof = roofs[i];
                } else {
                    break;
                }
            }
            roof = initRoof;
            for (int i = currentIndex - 1; i >= 0; i--) {
                if (roof >= roofs[i]) {
                    counter++;
                    roof = roofs[i];
                } else {
                    break;
                }
            }
            maxCounter = Math.max(maxCounter, counter);
            counter = 1;
            currentIndex++;
        }
        System.out.println(maxCounter);
    }
}
