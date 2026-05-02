class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        int n = nums.length;
        

        for(int index = 0 ; index<n;index++){
            ans[index]=nums[index];
            ans[index+n]=nums[index];
        }
        return ans;

    }
}