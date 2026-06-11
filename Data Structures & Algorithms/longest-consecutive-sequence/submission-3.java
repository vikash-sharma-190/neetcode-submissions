class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int n : nums){
            st.add(n);
        }

        int longest = 0;
        for(int n : nums){
            if(!st.contains(n-1)){
                int len = 1;
                while(st.contains(n+len)){
                    len++;
                }
                longest = Math.max(longest,len);
            }
        }
        return longest;
    }
}
