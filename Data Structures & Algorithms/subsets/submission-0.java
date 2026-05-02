class Solution {
 
     public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrackSubsets(nums, 0, new ArrayList<>(), res);
        return res;
    }

    private static void backtrackSubsets(int[] nums, int start, List<Integer> path, List<List<Integer>> res) {
        res.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backtrackSubsets(nums, i + 1, path, res);
            path.remove(path.size() - 1);
        }
    }
}
