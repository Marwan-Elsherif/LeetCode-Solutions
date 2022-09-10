class Solution {
    public int getMaximumGenerated(int n) {
        if(n<2)
            return n;
        
        int[] table = new int[n+1];
        int max = Integer.MIN_VALUE; 
        table[1] = 1;
        for(int i=0; (2*i +1)<=n; i++){
            table[2*i] = table[i];
            table[2*i + 1] = table[i] + table[i+1];
            max  = Math.max(max, Math.max(table[2*i], table[2*i+1]));
        }
       
        return max;
    }
}