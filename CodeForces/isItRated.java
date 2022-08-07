package CodeForces;
import java.util.Scanner;

public class isItRated {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] before = new int[length];
        int[] after = new int[length];
        for (int i = 0; i < length; i++) {
            before[i] = scanner.nextInt();
            after[i] = scanner.nextInt();
            if (before[i] != after[i]) {
                System.out.println("rated");
                return;
            }
        }
        for (int i = 1; i < length; i++) {

            if (before[i] > before[i - 1]) {
                System.out.println("unrated");
                return;
            }
        }
        System.out.println("maybe");
    }
}
