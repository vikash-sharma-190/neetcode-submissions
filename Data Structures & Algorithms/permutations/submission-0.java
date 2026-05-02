class Solution {
 public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrackPermute(nums, new ArrayList<>(), used, res);
        return res;
    }

    private static void backtrackPermute(int[] nums, List<Integer> path, boolean[] used, List<List<Integer>> res) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]){
            used[i] = true;
            path.add(nums[i]);
            backtrackPermute(nums, path, used, res);
            path.remove(path.size() - 1);
            used[i] = false;
            }
        }
    }
}
