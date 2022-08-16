package CodeForces_B;

import java.util.Scanner;

public class sayedyElRa2es {
    static boolean valid_move(int x, int y, int rows, int cols) {
        return x > -1 && x < rows && y > -1 && y < cols;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        int rows = Integer.parseInt(String.valueOf(temp.charAt(0)));
        int cols = Integer.parseInt(String.valueOf(temp.charAt(2)));
        if (rows == 1 && cols == 1) {
            System.out.println(0);
            return;
        }
        char pres = temp.charAt(temp.length() - 1);
        char[][] office = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            temp = scanner.next();
            for (int j = 0; j < cols; j++) {
                office[i][j] = temp.charAt(j);
            }
        }
        int counter = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (office[i][j] == pres) {
                    if (valid_move(i, j + 1, rows, cols)) {
                        if (office[i][j + 1] != '.' && office[i][j + 1] == pres) {
                            counter++;
                        }
                    }
                    if (valid_move(i, j - 1, rows, cols)) {
                        if (office[i][j - 1] != '.' && office[i][j - 1] == pres) {
                            counter++;
                        }
                    }
                    if (valid_move(i - 1, j, rows, cols)) {
                        if (office[i - 1][j] != '.' && office[i - 1][j] == pres) {
                            counter++;
                        }
                    }
                    if (valid_move(i + 1, j, rows, cols)) {
                        if (office[i + 1][j] != '.' && office[i + 1][j] == pres) {
                            counter++;
                        }
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
