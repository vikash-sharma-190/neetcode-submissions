public class Solution {
    public int[] twoSum(int[] nums, int target) {
      int n = nums.length;
      int[][] arr = new int[n][2];

      for(int i=0;i<n;i++){
        arr[i]= new int[]{nums[i],i};
      }

      Arrays.sort(arr,Comparator.comparingInt(e->e[0]));

      int i =0 ,j=n-1;
      while(i<j){
        int temp = arr[i][0] + arr[j][0];
        if(temp>target){
            j--;
        }
        else if(temp < target){
            i++;
        }else{
            return new int[]{Math.min(arr[i][1], arr[j][1]),
                                 Math.max(arr[i][1], arr[j][1])};
        }

      }
    return new int[0];
    }
}