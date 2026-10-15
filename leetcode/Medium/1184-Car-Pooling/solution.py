# LeetCode Problem: Car Pooling
# Link: https://leetcode.com/problems/car-pooling/
# Difficulty: Medium
# Language: python

class Solution(object):
    def carPooling(self, trips, capacity):
        """
        :type trips: List[List[int]]
        :type capacity: int
        :rtype: bool
        """
        # max location based on problem constraints (0 <= location <= 1000)
        timeline = [0] * 1001

        for num_passengers, start, end in trips:
            timeline[start] += num_passengers
            timeline[end] -= num_passengers

        current_capacity = 0
        for passengers in timeline:
            current_capacity += passengers
            if current_capacity > capacity:
                return False

        return True


        