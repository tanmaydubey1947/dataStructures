package graph;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFillAlgorithm {


    int[] delRow = {-1, 0, 1, 0};
    int[] delCol = {0, 1, 0, -1};

    private boolean isValid(int i, int j, int n, int m) {
        if (i < 0 || j < 0 || i >= n || j >= m) {
            return false;
        }
        return true;
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        int curColor = image[sr][sc];
        if (newColor == curColor) {
            return image;
        }

        bfs(sr, sc, newColor, image);
        return image;
    }

    private void bfs(int sr, int sc, int newColor, int[][] image) {

        int curColor = image[sr][sc];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{sr, sc});
        image[sr][sc] = newColor;
        int n = image.length;
        int m = image[0].length;

        while (!q.isEmpty()) {

            int[] cur = q.poll();
            int row = cur[0];
            int col = cur[1];

            for (int k = 0; k < 4; k++) {

                int nRow = row + delRow[k];
                int nCol = col + delCol[k];

                if (isValid(nRow, nCol, n, m) && image[nRow][nCol] == curColor) {
                    image[nRow][nCol] = newColor;
                    q.offer(new int[]{nRow, nCol});
                }
            }
        }
    }

}
