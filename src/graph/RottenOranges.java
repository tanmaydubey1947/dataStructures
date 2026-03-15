package graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

    private final int[] delRow = {-1, 0, 1, 0};
    private final int[] delCol = {0, 1, 0, -1};

    private boolean isValid(int row, int col, int maxRow, int maxCol) {

        if (row < 0 || row >= maxRow) {
            return false;
        }

        if (col < 0 || col >= maxCol) {
            return false;
        }

        return true;
    }

    public int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                }
            }
        }

        int count = bfs(grid, q);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        return count;
    }

    private int bfs(int[][] grid, Queue<int[]> q) {
        int count = -1;
        int n = grid.length;
        int m = grid[0].length;

        while (!q.isEmpty()) {

            int size = q.size();

            for (int i = 0; i < size; i++) {

                int[] cell = q.poll();
                int row = cell[0];
                int col = cell[1];

                for (int j = 0; j < 4; j++) {

                    int newRow = row + delRow[j];
                    int newCol = col + delCol[j];

                    if (isValid(newRow, newCol, n, m) &&
                            grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2;
                        q.offer(new int[]{newRow, newCol});
                    }
                }
            }
            count++;
        }
        return count == -1 ? 0 : count;
    }
}
