package CodeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NightWatch {
    public static void main(String[] args) {
        ArrayList<Integer> stewards = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            stewards.add(scanner.nextInt());
        }
        stewards.sort(Integer::compareTo);
        int min = stewards.get(0);
        int max = stewards.get(stewards.size() - 1);
        if (stewards.size() == 1) {
            System.out.println(0);
        } else if (min == max) {
            System.out.println(0);
        } else {
            stewards.removeAll(Collections.singleton(min));
            stewards.removeAll(Collections.singleton(max));
//        stewards.remove(stewards.get(0));
//        stewards.remove(stewards.get(stewards.size()-1));
            System.out.println(stewards.size());
        }
    }
}
