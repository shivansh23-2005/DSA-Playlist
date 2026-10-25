// LeetCode Problem: Word Search
// Link: https://leetcode.com/problems/word-search/
// Difficulty: Medium
// Language: java

class Solution {
static boolean ans = false;

public boolean exist(char[][] board, String word) {
    int m = board.length;
    int n = board[0].length;

    boolean[][] visited = new boolean[m][n];
    ans = false;

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (board[i][j] == word.charAt(0)) {
                solve(board, i, j, word, 0, visited);
            }

            if (ans) return true;
        }
    }

    return false;
}

public static void solve(char[][] board, int sr, int sc,
                         String s, int index, boolean[][] visited) {

    if (sr < 0 || sc < 0 || sr >= board.length || sc >= board[0].length)
        return;

    if (visited[sr][sc] || board[sr][sc] != s.charAt(index))
        return;

    if (index == s.length() - 1) {
        ans = true;
        return;
    }

    visited[sr][sc] = true;

    solve(board, sr + 1, sc, s, index + 1, visited);
    solve(board, sr, sc + 1, s, index + 1, visited);
    solve(board, sr - 1, sc, s, index + 1, visited);
    solve(board, sr, sc - 1, s, index + 1, visited);

    visited[sr][sc] = false;
}


}
