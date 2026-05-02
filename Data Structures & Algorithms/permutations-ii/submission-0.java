class Solution {
  public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtrackPermuteDup(nums, new ArrayList<>(), used, res);
        return res;
    }

    private static void backtrackPermuteDup(int[] nums, List<Integer> path, boolean[] used, List<List<Integer>> res) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue; // avoid duplicates
            used[i] = true;
            path.add(nums[i]);
            backtrackPermuteDup(nums, path, used, res);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}