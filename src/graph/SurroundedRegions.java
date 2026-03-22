package graph;

import java.util.*;

public class SurroundedRegions {

    int[] delRow = {-1, 0, 1, 0};
    int[] delCol = {0, -1, 0, 1};

    private boolean isValid(int i, int j, int n, int m) {
        return i >= 0 && i < n && j >= 0 && j < m;
    }

    public char[][] fill(char[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        int[][] ref = new int[n][m];
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            if (mat[0][i] == 'O') {
                ref[0][i] = -1;
                q.offer(new int[]{0, i});
            }
        }

        for (int i = 0; i < n; i++) {
            if (mat[i][0] == 'O') {
                ref[i][0] = -1;
                q.offer(new int[]{i, 0});
            }
        }

        for (int i = 0; i < m; i++) {
            if (mat[n - 1][i] == 'O') {
                ref[n - 1][i] = -1;
                q.offer(new int[]{n - 1, i});
            }
        }

        for (int i = 0; i < n; i++) {
            if (mat[i][m - 1] == 'O') {
                ref[i][m - 1] = -1;
                q.offer(new int[]{i, m - 1});
            }
        }

        while (!q.isEmpty()) {

            int[] cur = q.poll();
            int row = cur[0];
            int col = cur[1];

            for (int i = 0; i < 4; i++) {
                int nRow = delRow[i] + row;
                int nCol = delCol[i] + col;

                if (isValid(nRow, nCol, n, m)
                        && mat[nRow][nCol] == 'O'
                        && ref[nRow][nCol] == 0) {
                    q.offer(new int[]{nRow, nCol});
                    ref[nRow][nCol] = -1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (ref[i][j] == 0) {
                    mat[i][j] = 'X';
                }
            }
        }

        return mat;
    }

}
