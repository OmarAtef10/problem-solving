package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class Gifts {
    public static ArrayList<Integer> solve(ArrayList<Integer> gifts) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < gifts.size(); i++) {
            res.add(0);
        }
        for (int i = 0; i < gifts.size(); i++) {
            res.set(gifts.get(i) - 1, i + 1);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        ArrayList<Integer> gifts = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            gifts.add(scanner.nextInt());
        }
        ArrayList<Integer> res = solve(gifts);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i)+" ");
        }

    }
}
