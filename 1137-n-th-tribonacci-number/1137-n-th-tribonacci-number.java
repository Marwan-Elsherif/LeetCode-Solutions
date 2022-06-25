class Solution {
    public int tribonacci(int n) {
        int[] dp = new int[n+1];
        for(int i=0; i<=n; i++) dp[i] = -1;
        getVal(n, dp);
        return dp[n];
        
    }
    private int getVal(int n, int[] dp){
        if(n<=1) dp[n] = n;
        if(n==2) dp[n] = 1;
        if(dp[n] != -1) return dp[n];
        dp[n] = getVal(n-1, dp) + getVal(n-2, dp) + getVal(n-3, dp);
        return dp[n];
    }
}