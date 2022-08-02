package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int you = 0;
        int opp = 0;
        int count = scanner.nextInt();
        ArrayList<Integer> coins = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            coins.add(scanner.nextInt());
            opp += coins.get(i);
        }
        int counter = 0;
        coins.sort(Integer::compareTo);
        for (int i = coins.size() - 1; i >= 0; i--) {
            you += coins.get(i);
            opp -= coins.get(i);
            counter++;
            if (you > opp) {
                break;
            }
        }
        System.out.println(counter);
    }
}
