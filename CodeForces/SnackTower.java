package CodeForces;

import java.util.*;

public class SnackTower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> snacks = new ArrayList<>();
        int count = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.add(scanner.nextInt());
        }
        while (arrayList.size() > 0) {
            if (arrayList.get(0) == count && snacks.isEmpty()) {
                System.out.println(arrayList.get(0));
                arrayList.remove(0);
                count--;
                continue;

            } else if (arrayList.get(0) == count && !snacks.isEmpty()) {
                snacks.add(arrayList.get(0));
                arrayList.remove(0);
            } else {
                snacks.add(arrayList.get(0));
                snacks.sort(Integer::compareTo);
                arrayList.remove(0);
            }
            if (!snacks.isEmpty() && snacks.get(snacks.size() - 1) > count) {
                int diff = snacks.get(snacks.size() - 1) - count;
                count -= diff;
                while (diff >= 0 && !snacks.isEmpty()) {
                    System.out.print(snacks.get(snacks.size() - 1) + " ");
                    snacks.remove(snacks.size() - 1);
                    diff--;
                }
                System.out.println();
                continue;
            } else {
                System.out.println();
            }
            count--;
        }
    }
}
