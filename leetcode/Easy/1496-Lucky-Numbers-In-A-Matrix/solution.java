// LeetCode Problem: Lucky Numbers in a Matrix
// Link: https://leetcode.com/problems/lucky-numbers-in-a-matrix/
// Difficulty: Easy
// Language: java

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer>list=new ArrayList<>();
        int row[]=new int[matrix.length];
        int column[]=new int[matrix[0].length];
        
          for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            row[i] = min;
        }
         for (int j = 0; j < matrix[0].length; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < matrix.length; i++) {
                max = Math.max(max, matrix[i][j]);
            }
            column[j] = max;
        }

        for(int i=0;i<row.length;i++)
        {
            for(int j=0;j<column.length;j++)
            {
            if(row[i]==column[j])
            {
                list.add(row[i]);
            }
            }
        }
        return list;
    }
}