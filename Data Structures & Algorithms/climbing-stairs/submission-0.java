class Solution {
    public int climbStairs(int n) {
        /*
         f(i) == {
            1 n=0
            1. n=1
            f(i-1) + f(n-2)
         }
        */

        if(n==0 || n==1){
            return 1;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }
}
