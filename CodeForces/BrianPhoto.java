package CodeForces;

import java.util.Scanner;

public class BrianPhoto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[][] photo = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char color = scanner.next().charAt(0);
                photo[i][j] = color;
                if (color != 'W' && color != 'B' && color != 'G') {
                    System.out.println("#Color");
                    return;
                }
            }
        }
        System.out.println("#Black&White");

    }
}
