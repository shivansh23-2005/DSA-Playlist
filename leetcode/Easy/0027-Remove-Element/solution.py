# LeetCode Problem: Remove Element
# Link: https://leetcode.com/problems/remove-element/
# Difficulty: Easy
# Language: python

class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        ln=len(nums)
        k=0
        for i in range(ln):
            if nums[i]!=val:
                nums[k]=nums[i]
                k+=1
        return k
        
        