package graph;

import java.util.*;

public class DistanceOfNearestCellHavingOne {

    int[] delRow = {-1, 0, 1, 0};
    int[] delCol = {0, 1, 0, -1};

    private boolean isValid(int i, int j, int n, int m) {
        return i >= 0 && i < n && j >= 0 && j < m;
    }

    public int[][] nearest(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    q.offer(new int[]{i, j, 0});
                }
            }
        }

        int[][] distance = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) {
                    distance[i][j] = (int) 1e9;
                }
            }
        }

        bfs(q, grid, distance);
        return distance;
    }

    private void bfs(Queue<int[]> q, int[][] grid, int[][] distance) {

        int n = grid.length;
        int m = grid[0].length;

        while (!q.isEmpty()) {

            int[] cur = q.poll();

            int row = cur[0];
            int col = cur[1];
            int dist = cur[2];

            for (int k = 0; k < 4; k++) {

                int nRow = row + delRow[k];
                int nCol = col + delCol[k];

                if (isValid(nRow, nCol, n, m) && grid[nRow][nCol] != 1 && dist + 1 < distance[nRow][nCol]) {
                    distance[nRow][nCol] = 1 + dist;
                    q.offer(new int[]{nRow, nCol, dist + 1});
                }
            }
        }
    }
}
