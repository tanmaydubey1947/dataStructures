package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NumberOfProvinces {

    public int numProvinces(int[][] adj) {

        int n = adj.length;
        List<List<Integer>> adjLs = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjLs.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (adj[i][j] == 1) {
                    adjLs.get(i + 1).add(j + 1);
                    adjLs.get(j + 1).add(i + 1);
                }
            }
        }

        boolean[] visited = new boolean[n + 1];
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                bfs(adjLs, i, visited);
                ans++;
            }
        }

        return ans;
    }

    private void bfs(List<List<Integer>> adjLs, int node, boolean[] visited) {

        Queue<Integer> q = new LinkedList<>();
        q.offer(node);
        visited[node] = true;

        while (!q.isEmpty()) {
            int current = q.poll();
            for (int neighbour : adjLs.get(current)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.offer(neighbour);
                }
            }
        }
    }

}
