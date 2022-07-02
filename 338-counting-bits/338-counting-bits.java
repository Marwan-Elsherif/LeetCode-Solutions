class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0; i<=n; i++){
            int count = 0;
            int t=i;
            while (t > 0) {
                count += t & 1;
                t >>= 1;
            }
            ans[i] = count;
        }
        return ans;
    }
}