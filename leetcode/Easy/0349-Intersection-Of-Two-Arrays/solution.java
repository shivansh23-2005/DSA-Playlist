// LeetCode Problem: Intersection of Two Arrays
// Link: https://leetcode.com/problems/intersection-of-two-arrays/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>a1=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    a1.add(nums2[j]);
                    System.out.println(nums2[j]);
                }
            }
        }
        int p=0;
            int a[]=new int[a1.size()];
            for(int k:a1)
            {
                a[p]+=k;
                p+=1;
            }
            return a;
    }
}