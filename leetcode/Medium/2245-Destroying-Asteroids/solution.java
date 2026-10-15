// LeetCode Problem: Destroying Asteroids
// Link: https://leetcode.com/problems/destroying-asteroids/
// Difficulty: Medium
// Language: java

import java.util.Arrays;

class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);

        long currMass = mass; 

        for (int asteroid : asteroids) {
            if (currMass < asteroid) {
                return false;
            }
            currMass += asteroid;
        }

        return true;
    }
}