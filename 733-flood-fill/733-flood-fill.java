class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int prevColor= image[sr][sc];
        image[sr][sc] = color;
        if(prevColor != color){
            if(sr - 1 >= 0 && image[sr-1][sc] == prevColor)
                floodFill(image, sr-1 ,sc, color);
            if(sr + 1 < image.length && image[sr+1][sc] == prevColor)
                floodFill(image, sr+1 ,sc, color);
            if(sc - 1 >=0 && image[sr][sc-1] == prevColor)
                floodFill(image, sr ,sc-1, color);
            if(sc + 1 < image[sr].length && image[sr][sc+1] == prevColor)
                floodFill(image, sr ,sc+1, color);
        }
        return image;
        
    }
}