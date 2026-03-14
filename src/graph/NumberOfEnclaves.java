package graph;

import java.util.*;

public class NumberOfEnclaves {

    int[] delRow = {-1, 0, 1, 0};
    int[] delCol = {0, -1, 0, 1};

    boolean isValid(int i, int j, int n, int m) {
        if (i < 0 || j < 0 || i >= n || j >= m) {
            return false;
        }
        return true;
    }

    public int numberOfEnclaves(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];

        // 0th Row
        for (int i = 0; i < m; i++) {
            if (!visited[0][i] && grid[0][i] == 1) {
                bfs(grid, visited, 0, i);
            }
        }

        // n - 1th Row
        for (int i = 0; i < m; i++) {
            if (!visited[n - 1][i] && grid[n - 1][i] == 1) {
                bfs(grid, visited, n - 1, i);
            }
        }

        // 0th Col
        for (int i = 0; i < n; i++) {
            if (!visited[i][0] && grid[i][0] == 1) {
                bfs(grid, visited, i, 0);
            }
        }

        // m - 1th Col
        for (int i = 0; i < n; i++) {
            if (!visited[i][m - 1] && grid[i][m - 1] == 1) {
                bfs(grid, visited, i, m - 1);
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    ans++;
                }
            }
        }

        return ans;
    }

    private void bfs(int[][] grid, boolean[][] visited, int i, int j) {

        int n = grid.length;
        int m = grid[0].length;

        visited[i][j] = true;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{i, j});
        grid[i][j] = 2;

        while (!q.isEmpty()) {

            int[] cur = q.poll();
            int row = cur[0];
            int col = cur[1];

            for (int k = 0; k < 4; k++) {

                int nRow = row + delRow[k];
                int nCol = col + delCol[k];

                if (isValid(nRow, nCol, n, m) && !visited[nRow][nCol] && grid[nRow][nCol] == 1) {
                    visited[nRow][nCol] = true;
                    grid[nRow][nCol] = 2;
                    q.offer(new int[]{nRow, nCol});
                }
            }
        }
    }
}
