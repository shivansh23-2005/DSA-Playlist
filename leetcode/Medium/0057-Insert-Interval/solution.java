// LeetCode Problem: Insert Interval
// Link: https://leetcode.com/problems/insert-interval/
// Difficulty: Medium
// Language: java

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length;
        int newArray[][]=new int[n+1][];
        for(int i=0;i<n;i++)
        {
            newArray[i]=intervals[i];
        }
        newArray[n]=newInterval;
        Arrays.sort(newArray,(a,b)->a[0]-b[0]);
        List<int[]>list=new ArrayList<>();
        list.add(newArray[0]);
        for(int i=1;i<newArray.length;i++)
        {
            int last[]=list.get(list.size()-1);
            if(last[1]>=newArray[i][0])
            {
                last[1]=Math.max(last[1],newArray[i][1]);
            }
            else{
            list.add(newArray[i]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}