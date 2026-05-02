class Solution {
    public boolean hasDuplicate(int[] nums) {
        //return Arrays.stream(nums).distinct().count() < num.length;

        // HashSet<Integer> hs = new HashSet<>();

        // for(int e : nums){
        //     if(!hs.add(e)) return true ;
        // }
        // return  false ;


        // Arrays.sort(nums);

        // int n = nums.length;
        // for(int i=0;i<n;i++){

        //     if(i>0 && nums[i]== nums[i-1]){
        //         return true;
        //     }
        // }
        // return false;

        // int n = nums.length;
        // for(int i=0;i<n;i++){

        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;



        return Arrays.stream(nums).boxed().collect(Collectors.toSet()).size() < nums.length;
    }
}
