public class matrixReshape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        if (r * c != mat.length * mat[0].length) {
            return mat;
        }
        int[][] out = new int[r][c];
        int[] temp = new int[mat.length * mat[0].length];
        int index = 0;
        //Inputting all elements of input matrix into a 1D array for easy traversing
        for (int[] i : mat) {
            for (int j : i) {
                temp[index] = j;
                index++;
            }
        }
        index = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                out[i][j] = temp[index];
                index++;
            }
        }
        return out;
    }
}
