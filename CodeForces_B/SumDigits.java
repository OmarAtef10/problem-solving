package CodeForces_B;

import java.util.ArrayList;
import java.util.Scanner;

public class SumDigits {
    public static int magic(ArrayList<Integer> num) {
        int res = 0;
        for (Integer i : num) {
            res += i;
        }
        StringBuilder str = new StringBuilder(String.valueOf(res));
        num.clear();
        for (char c : str.toString().toCharArray()) {
            num.add(Integer.parseInt(String.valueOf(c)));
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        StringBuilder str = new StringBuilder(String.valueOf(num));
        ArrayList<Integer> arr = new ArrayList<>();
        for (char c : str.toString().toCharArray()) {
            arr.add(Integer.parseInt(String.valueOf(c)));
        }
        if (arr.size() == 1) {
            System.out.println(0);
            return;
        }
        int count = 0;
        int number;
        do {
            number = magic(arr);
            count++;

        } while (number > 9);
        System.out.println(count);
    }
}
