class Solution {
    public int maxAreaOfIsland(int[][] grid) {   
        boolean[][] checked = new boolean[grid.length][grid[0].length]; 
        int ans = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                ans = Math.max(ans, getArea(checked, r, c, grid));
            }
        }
        return ans;
    }
     public int getArea(boolean[][] checked , int r, int c, int[][] grid){
        if (r < 0 || r >= checked.length || c < 0 || c >= checked[0].length ||
            checked[r][c] || grid[r][c] == 0)
            return 0;
        checked[r][c] = true;
        return (1 + getArea(checked, r+1, c, grid) + getArea(checked, r-1, c, grid)
                  + getArea(checked, r, c-1, grid) + getArea(checked, r, c+1, grid));
        }
}