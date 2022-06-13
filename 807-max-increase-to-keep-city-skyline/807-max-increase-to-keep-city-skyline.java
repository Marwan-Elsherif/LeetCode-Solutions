class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] maxPerRow = new int[grid.length];
        int[] maxPerCol = new int[grid.length];
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid.length; j++){
                maxPerRow[i] = Math.max(maxPerRow[i], grid[i][j]);
                maxPerCol[j] = Math.max(maxPerCol[j], grid[i][j]);
            }
        }
        int result = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid.length; j++){
                result += Math.min(maxPerRow[i], maxPerCol[j]) - grid[i][j];
            }
        }
        return result;
    }
}