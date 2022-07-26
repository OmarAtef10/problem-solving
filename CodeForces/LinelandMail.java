package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class LinelandMail {
    public static void mailCost(ArrayList<Integer> coords) {
        int minres = -1;
        int maxres = -1;
        int min = coords.get(0);
        int max = coords.get(coords.size() - 1);
        for (int i = 0; i < coords.size(); i++) {
            if (i < coords.size() - 1) {
                if (i == 0) {
                    minres = coords.get(i + 1) - coords.get(i);
                } else {
                    minres = Math.min(coords.get(i) - coords.get(i - 1), coords.get(i + 1) - coords.get(i));
                }
                if (i == 0) {
                    maxres = max - coords.get(i);
                } else {
                    maxres = Math.max(coords.get(i) - min, max - coords.get(i));
                }
                System.out.println(minres + " " + maxres);
            }
            if (i == coords.size() - 1) {
                minres = coords.get(i) - coords.get(i - 1);
                maxres = coords.get(i) - coords.get(0);
                System.out.println(minres + " " + maxres);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        ArrayList<Integer> coords = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            coords.add(scanner.nextInt());
        }
        mailCost(coords);
    }
}
