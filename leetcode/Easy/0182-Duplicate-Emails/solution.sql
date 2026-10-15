-- LeetCode Problem: Duplicate Emails
-- Link: https://leetcode.com/problems/duplicate-emails/
-- Difficulty: Easy
-- Language: mysql

# Write your MySQL query statement below
select email as Email from person group by email having count(id)>1;
