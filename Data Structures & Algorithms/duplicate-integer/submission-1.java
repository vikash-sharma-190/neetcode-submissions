class Solution {
    public boolean hasDuplicate(int[] nums) {
        //return Arrays.stream(nums).distinct().count() < num.length;

        HashSet<Integer> hs = new HashSet<>();

        for(int e : nums){
            if(!hs.add(e)) return true ;
        }
        return  false ;
    }
}
