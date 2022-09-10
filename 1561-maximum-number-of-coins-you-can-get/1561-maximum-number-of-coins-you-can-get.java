class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);

        int leaveForBob = piles.length/3;
        int total = 0;
        for(int i=piles.length-2; i>=leaveForBob; i-=2){
            total += piles[i];
        }
        return total;
    }
}