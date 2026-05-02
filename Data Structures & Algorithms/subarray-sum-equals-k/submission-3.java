class Solution {
    public int subarraySum(int[] nums, int k) {
        int count= 0,  curSum=0;
        Map<Integer,Integer> prefixSum = new HashMap<>();
        prefixSum.put(0,1);

        for(int e : nums){
            curSum+=e;
            count+=prefixSum.getOrDefault(curSum-k,0);
            prefixSum.put(curSum,prefixSum.getOrDefault(curSum,0)+1);
        }

        return count;

    }
}