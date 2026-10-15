# LeetCode Problem: Check if All the Integers in a Range Are Covered
# Link: https://leetcode.com/problems/check-if-all-the-integers-in-a-range-are-covered/
# Difficulty: Easy
# Language: python

class Solution(object):
    def isCovered(self, ranges, left, right):
        """
        :type ranges: List[List[int]]
        :type left: int
        :type right: int
        :rtype: bool
        """
        arr = [0] * 52  

        for r in ranges:
            arr[r[0]] += 1
            arr[r[1] + 1] -= 1
        for i in range(1, 52):
            arr[i] += arr[i - 1]
        for i in range(left, right + 1):
            if arr[i] <= 0:
                return False

        return True

        