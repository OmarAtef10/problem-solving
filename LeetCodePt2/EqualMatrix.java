package LeetCodePt2;

public class EqualMatrix {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
                matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }

    public boolean findRotation(int[][] mat, int[][] target) {
        if (isEqual(mat, target)) {
            return true;
        } else {
            int count = 0;
            while (count <= 4) {
                rotate(mat);
                if (isEqual(mat, target)) {
                    return true;
                } else {
                    count++;
                }
            }
        }

        return false;
    }

    public boolean isEqual(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] == target[i][j]) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
