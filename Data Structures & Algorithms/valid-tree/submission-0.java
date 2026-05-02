public class Solution {
    public boolean validTree(int n, int[][] edges) {
        if (edges.length > n - 1) {
            return false;
        }

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        // Set<Integer> visit = new HashSet<>();
        boolean[] visit = new boolean[n];
        if (!dfs(0, -1, visit, adj)) {
            return false;
        }
        for (boolean v : visit) {
            if (!v) return false;
        }
        return true;
    }

    private boolean dfs(int node, int parent, boolean[] visit, List<List<Integer>> adj) {
        visit[node] = true;
        for (int nei : adj.get(node)) {
            if (nei == parent) continue;
            if (visit[nei]) return false;
            if (!dfs(nei, node, visit, adj)) return false;
        }
        return true;
    }
}