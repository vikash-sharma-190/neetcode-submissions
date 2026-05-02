public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int L = 0; L < nums.length; L++) {
            for (int R = L + 1; R < nums.length; R++) {
                if (Math.abs(R-L)<=k && nums[L] == nums[R]) {
                    return true;
                }
            }
        }
        return false;
    }
}