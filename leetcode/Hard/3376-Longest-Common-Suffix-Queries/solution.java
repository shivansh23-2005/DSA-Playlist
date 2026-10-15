// LeetCode Problem: Longest Common Suffix Queries
// Link: https://leetcode.com/problems/longest-common-suffix-queries/
// Difficulty: Hard
// Language: java

class Solution {

    class TrieNode {
        TrieNode[] child = new TrieNode[26];

        int index;
        int len;

        TrieNode(int index, int len) {
            this.index = index;
            this.len = len;
        }
    }

    TrieNode root;

    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {

        int smallestIndex = 0;

        // globally smallest string
        for (int i = 1; i < wordsContainer.length; i++) {

            if (wordsContainer[i].length() <
                wordsContainer[smallestIndex].length()) {

                smallestIndex = i;
            }
        }

        root = new TrieNode(
            smallestIndex,
            wordsContainer[smallestIndex].length()
        );

        // insert all words
        for (int i = 0; i < wordsContainer.length; i++) {
            insert(wordsContainer[i], i);
        }

        int[] ans = new int[wordsQuery.length];

        // process queries
        for (int i = 0; i < wordsQuery.length; i++) {
            ans[i] = search(wordsQuery[i]);
        }

        return ans;
    }

    private void insert(String word, int index) {

        TrieNode node = root;
        int len = word.length();

        update(node, len, index);

        // reverse insert
        for (int i = word.length() - 1; i >= 0; i--) {

            int ch = word.charAt(i) - 'a';

            if (node.child[ch] == null) {
                node.child[ch] = new TrieNode(index, len);
            }

            node = node.child[ch];

            update(node, len, index);
        }
    }

    private void update(TrieNode node, int len, int index) {

        if (len < node.len) {
            node.len = len;
            node.index = index;
        }
    }

    private int search(String word) {

        TrieNode node = root;

        // reverse search
        for (int i = word.length() - 1; i >= 0; i--) {

            int ch = word.charAt(i) - 'a';

            if (node.child[ch] == null) {
                break;
            }

            node = node.child[ch];
        }

        return node.index;
    }
}