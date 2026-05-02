class Solution {
    public int findJudge(int n, int[][] trust) {
      int[] outD = new int[n+1];
      int[] inD = new int[n+1];

      for(int[] e : trust){
        int u = e[0];
        int v = e[1];
        // u --> v

        outD[u]++;
        inD[v]++;
      }

      for(int i = 1;i<=n;i++){
        if(outD[i]==0 && inD[i]==n-1){
            return i;
        }
      }
      return -1;
    }
}