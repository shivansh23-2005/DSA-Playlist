// LeetCode Problem: Flood Fill
// Link: https://leetcode.com/problems/flood-fill/
// Difficulty: Easy
// Language: java

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int old_color=image[sr][sc];
        if(old_color==color)
        {
            return image;
        }
        solve(image,sr,sc,color,old_color);  
        return image;
    }
    void solve(int[][]image,int cr,int cc,int color,int old_color)
    {
        if(cr<0 || cr>=image.length|| cc<0 ||cc>=image[0].length||image[cr][cc]!=old_color)
        {
            return;
        }
        image[cr][cc]=color;
        //left
        solve(image,cr,cc-1,color,old_color);
        //right
        solve(image,cr,cc+1,color,old_color);
        //down 
        solve(image,cr+1,cc,color,old_color);
        //up
        solve(image,cr-1,cc,color,old_color);
    }
}