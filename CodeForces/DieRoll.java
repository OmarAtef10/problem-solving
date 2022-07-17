package CodeForces;

import java.util.Scanner;

public class DieRoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max = Math.max(a, b);
        String [] die ={"1/6","1/3","1/2","2/3","5/6","1/1"};
        System.out.println(die[6-max]);

    }
}
