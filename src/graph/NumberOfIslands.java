package graph;

public class NumberOfIslands {


    int[] delRow = {0, 0, 1, -1, -1, -1, 1, 1};
    int[] delCol = {-1, 1, 0, 0, -1, 1, -1, 1};

    boolean isValid(int i, int j, int n, int m) {
        return i >= 0 && j >= 0 && i < n && j < m;
    }

    public int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (!visited[i][j] && grid[i][j] == '1') {
                    ans++;
                    dfs(grid, visited, i, j);
                }
            }
        }

        return ans;
    }

    private void dfs(char[][] grid, boolean[][] visited, int i, int j) {

        visited[i][j] = true;
        int n = grid.length;
        int m = grid[0].length;

        for (int k = 0; k < 8; k++) {

            int nRow = i + delRow[k];
            int nCol = j + delCol[k];

            if (isValid(nRow, nCol, n, m)
                    && !visited[nRow][nCol]
                    && grid[nRow][nCol] == '1') {
                dfs(grid, visited, nRow, nCol);
            }
        }
    }
}
