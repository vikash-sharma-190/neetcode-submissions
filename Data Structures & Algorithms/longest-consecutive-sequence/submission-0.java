class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        HashSet<Integer> st = new HashSet<>();
        for(int e : nums){
            st.add(e);
        }

        for(int e : nums){
            int streak =0,cur=e;
            while(st.contains(cur)){
                cur++;
                streak++;
            }

            res= Math.max(res,streak);
        }
        return res;
    }
}
