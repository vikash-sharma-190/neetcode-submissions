class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n*2];
        for(int index = 0 ; index<n;index++){
            ans[index]=ans[index+n]=nums[index];
        }
        return ans;

    }
}