// LeetCode Problem: Maximum Product of Two Digits
// Link: https://leetcode.com/problems/maximum-product-of-two-digits/
// Difficulty: Easy
// Language: java

class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer>list=new ArrayList<>();
        while(n!=0)
        {
            int rem=n%10;
            list.add(rem);
            n=n/10;
        }
        Collections.sort(list);
        int a=list.get(list.size()-1);
        int b=list.get(list.size()-2);
        int product=a*b;
        return product;
    }
}