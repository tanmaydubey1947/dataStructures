package graph;

import java.util.List;

public class DetectCycleInGraph {

    public boolean isCycle(int V, List<Integer>[] adj) {

        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(visited, adj, i, -1)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(boolean[] visited, List<Integer>[] adj, int node, int parent) {

        visited[node] = true;

        for (int neighbour : adj[node]) {
            if (!visited[neighbour]) {
                if (dfs(visited, adj, neighbour, node)) {
                    return true;
                }
            } else if (neighbour != parent) {
                return true;
            }
        }

        return false;
    }

}
