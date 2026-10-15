// LeetCode Problem: Spiral Matrix II
// Link: https://leetcode.com/problems/spiral-matrix-ii/
// Difficulty: Medium
// Language: java

class Solution {

    public int[][] generateMatrix(int n) {

        int num=1;
        int nums[][]=new int[n][n];

        int top=0;
        int left=0;
        int right=n-1;
        int bottom=n-1;

        while(top<=bottom && left<=right)
        {
            if(left<=right){

                int l=left;

                while(l<=right)
                {
                    nums[top][l]=num;
                    l++;
                    num++;
                }

                top++;

                int r=top;

                while(r<=bottom)
                {
                    nums[r][right]=num;
                    num++;
                    r++;
                }

                right--;
            }

            if(top<=bottom){

                int r=right;

                while(r>=left)
                {
                    nums[bottom][r]=num;
                    num++;
                    r--;
                }

                bottom--;

                int b=bottom;

                while(b>=top)
                {
                    nums[b][left]=num;
                    num++;
                    b--;
                }

                left++;
            }
        }

        return nums;
    }
}