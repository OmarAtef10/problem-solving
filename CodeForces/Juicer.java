package CodeForces;

import java.util.Scanner;

public class Juicer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int size = scanner.nextInt();
        int limit = scanner.nextInt();
        int current = 0;
        int counter = 0;
        while (num > 0) {
            int orange = scanner.nextInt();
            if (orange > size) {
                num--;
                continue;
            } else {
                current += orange;
                if (current > limit) {
                    counter++;
                    current = 0;
                }
            }
            num--;
        }
        System.out.println(counter);
    }
}
