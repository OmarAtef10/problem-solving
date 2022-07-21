package CodeForces;

import java.util.Scanner;

public class FreeIceCream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operations = scanner.nextInt();
        long current = scanner.nextLong();
        scanner.nextLine();
        int sadChild = 0;
        while (operations > 0) {
            String op = scanner.nextLine();
            if (op.charAt(0) == '+') {
                int amount = Integer.parseInt(op.substring(2, op.length()));
                current += amount;
            } else {
                int amount = Integer.parseInt(op.substring(2, op.length()));
                if (amount > current) {
                    sadChild++;
                } else {
                    current-=amount;
                }
            }
            operations--;
        }
        System.out.println(current+" "+sadChild);
    }
}
