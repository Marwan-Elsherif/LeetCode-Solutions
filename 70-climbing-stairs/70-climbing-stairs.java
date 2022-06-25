class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
          dp[i] = -1;
        }
        getStairs(n, dp);
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