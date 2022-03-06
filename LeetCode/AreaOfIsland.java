public class AreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int count = 0;
        for(int row = 0; row < grid.length; row++){

            for(int column = 0; column < grid[0].length; column++){

                if(grid[row][column] == 1){
                    int val = getArea(row, column, grid);
                    count = Math.max(count, val);
                }
            }
        }

        return count;
    }

    public int getArea(int row, int column, int[][] grid) {
        if( row < 0 || column < 0 || row >= grid.length || column >= grid[0].length || grid[row][column] == 0){
            return 0;
        }
        int current = grid[row][column];

        //Set the Current to Zero so that its neighbors wont count it.
        grid[row][column] = 0;
        int left = getArea(row, column - 1, grid);
        int rigth = getArea(row, column + 1, grid);
        int up = getArea(row - 1, column, grid);
        int down = getArea(row + 1, column, grid);

        return left + rigth + up + down + current;
    }
}
