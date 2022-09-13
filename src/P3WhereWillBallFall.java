public class P3WhereWillBallFall {
    
    public int[] findBall(int[][] grid) {

        int cols = grid[0].length;
        
        int[] result = new int[cols];

        for (int i = 0; i < cols; i++) {
            helper(result, 0, i, grid, i);
        }

        return result;
    }

    private static void helper(int[] result, int x, int y, int[][] grid, int ball) {

        int rows = grid.length;
        int cols = grid[0].length;

        int val = grid[x][y];

        if (val == 1) {
            if (y == cols - 1) {
                result[ball] = -1;
            } else if (grid[x][y + 1] == -1) {
                result[ball] = -1;
            } else if (x == rows - 1) {
                result[ball] = y + 1;
            } else {
                helper(result, x + 1, y + 1, grid, ball);
            }
        } else if (val == -1) {
            if (y == 0) {
                result[ball] = -1;
            } else if (grid[x][y - 1] == 1) {
                result[ball] = -1;
            } else if (x == rows - 1) {
                result[ball] = y - 1;
            } else {
                helper(result, x + 1, y - 1, grid, ball);
            }
        }
    }
}
