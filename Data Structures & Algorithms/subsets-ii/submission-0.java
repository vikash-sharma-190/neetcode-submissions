class Solution {

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrackSubsetsDup(nums, 0, new ArrayList<>(), res);
        return res;
    }

    private static void backtrackSubsetsDup(int[] nums, int start, List<Integer> path, List<List<Integer>> res) {
        res.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue; // skip duplicates
            path.add(nums[i]);
            backtrackSubsetsDup(nums, i + 1, path, res);
            path.remove(path.size() - 1);
        }
    }

}
