public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            indegree[pre[0]]++;
            adj.get(pre[1]).add(pre[0]);
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        List<Integer> output = new ArrayList<>();
        while (!q.isEmpty()) {
            int node = q.poll();
            output.add(node);
            for (int nei : adj.get(node)) {
                indegree[nei]--;
                if (indegree[nei] == 0) {
                    q.add(nei);
                }
            }
        }

        if (output.size() != numCourses) {
            return new int[0];
        }
      int[] res = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            res[i] = output.get(i);
        }
        return res;
    }
}