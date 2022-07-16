package CodeForces;

import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int price = in.nextInt();
        int OGPrice = price;
        int faka = in.nextInt();
        in.close();
        int count = 1;
        int total = 1;
        while (price % 10 != faka) {
            if (price % 10 == 0) {
                break;
            }
            total++;
            count++;
            price = OGPrice * count;
        }
        System.out.println(total);
    }
}
