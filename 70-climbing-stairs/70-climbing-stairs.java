class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
          dp[i] = -1;
        }
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n ; i++) {
          dp[i] = dp[i-1]+ dp[i-2];
        }
        return dp[n];   
    }
    private int getStairs(int n, int dp[]){
        if (n <= 1)
          return dp[n] = 1;

        if (dp[n] != -1) {
          return dp[n];
        }
        dp[n] = getStairs(n - 1, dp) + getStairs(n - 2, dp);
        return dp[n];
    }
}