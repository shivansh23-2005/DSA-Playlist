// LeetCode Problem: Sort Characters By Frequency
// Link: https://leetcode.com/problems/sort-characters-by-frequency/
// Difficulty: Medium
// Language: java

class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character>pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        pq.addAll(map.keySet());
         StringBuilder res = new StringBuilder();

        while(!pq.isEmpty()) {
            char ch = pq.poll();

            for(int i = 0; i < map.get(ch); i++) {
                res.append(ch);
            }
        }

        return res.toString();
    }
}