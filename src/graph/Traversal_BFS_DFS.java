package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Traversal_BFS_DFS {

    public List<Integer> dfsOfGraph(int V, List<List<Integer>> adj) {
        boolean[] visited = new boolean[V];
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, visited, adj, ans);
            }
        }

        return ans;
    }

    public List<Integer> bfsOfGraph(int V, List<List<Integer>> adj) {
        boolean[] visited = new boolean[V];
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                bfs(i, visited, adj, ans);
            }
        }
        return ans;
    }

    private void dfs(int node, boolean[] visited, List<List<Integer>> adj, List<Integer> ans) {

        visited[node] = true;
        ans.add(node);

        for (int neighbour : adj.get(node)) {
            if (!visited[neighbour]) {
                dfs(neighbour, visited, adj, ans);
            }
        }
    }

    private void bfs(int node, boolean[] visited, List<List<Integer>> adj, List<Integer> ans) {

        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        ans.add(node);
        visited[node] = true;

        while (!q.isEmpty()) {

            int current = q.poll();

            for (int neighbour : adj.get(current)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.add(neighbour);
                    ans.add(neighbour);
                }
            }
        }
    }
}
