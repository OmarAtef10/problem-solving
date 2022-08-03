package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long max = scanner.nextLong();
        long index = scanner.nextLong();

        if (max % 2 == 0) {
            if (index > max / 2) {
                System.out.println((index - (max / 2) )*2);
            } else {
                System.out.println(index * 2 - 1);
            }
        } else {
            if (index > max / 2 + 1) {
                System.out.println((index-((max/2)+1))*2);
            } else {
                System.out.println(index * 2 - 1);
            }
        }
    }
}