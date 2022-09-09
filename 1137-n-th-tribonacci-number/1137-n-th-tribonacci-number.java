class Solution {
    public int tribonacci(int n) {
        // Memoization
       if(n<2) return n;
        if(n==2) return 1;
        int[] memo = new int[n+1];
        memo[0]=0;
        memo[1]=1;
        memo[2]=1;
        
        for (int i=3; i<=n;i++){
            memo[i] = -1;
        }
        return getTri(n, memo);
    }
    public int getTri(int n, int[] memo) {
        
        if(memo[n] != -1){
            return memo[n];
        }
        memo[n] = getTri(n-1, memo) + getTri(n-2, memo) + getTri(n-3, memo);
        return memo[n];
    }
    
}