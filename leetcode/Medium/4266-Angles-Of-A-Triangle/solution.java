// LeetCode Problem: Angles of a Triangle
// Link: https://leetcode.com/problems/angles-of-a-triangle/
// Difficulty: Medium
// Language: java

class Solution {
    public double[] internalAngles(int[] sides) {
        double a=sides[0];
        double b=sides[1];
        double c=sides[2];
        if(a+b<=c || a+c<=b || b+c<=a)
        {
            return new double[0];
        }
        double cosA=((b*b+c*c-a*a)/(2*b*c));
         double cosB=((a*a+c*c-b*b)/(2*a*c));
         double cosC=((a*a+b*b-c*c)/(2*a*b));
        double A=Math.acos(Math.max(-1.0,Math.min(1.0,cosA)));
         double B=Math.acos(Math.max(-1.0,Math.min(1.0,cosB)));
         double C=Math.acos(Math.max(-1.0,Math.min(1.0,cosC)));
        double redtodeg=180.0/Math.PI;
     double[] result=new double[]
            {
            A *redtodeg,
             B *redtodeg, C*redtodeg,
            };
        Arrays.sort(result);
        return result;
        
    }
}