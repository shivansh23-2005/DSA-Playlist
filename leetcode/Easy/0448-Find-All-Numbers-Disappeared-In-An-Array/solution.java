// LeetCode Problem: Find All Numbers Disappeared in an Array
// Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Difficulty: Easy
// Language: java

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer>a1=new ArrayList<>();
        int Array[]=new int[nums.length];
        TreeSet<Integer>t1=new TreeSet<>();
        for(int k:nums)
        {
            t1.add(k);
        }
        int j=0;
        for(int i:t1)
        {
            Array[j]+=i;
            j+=1;    
        }
        int l=0;
        for(int q=1;q<nums.length+1;q++)
        {
            if(q==Array[l])
            {
                l++;
            }
            else
            {
                a1.add(q);
            }
        }
 
        return a1;
    }
}