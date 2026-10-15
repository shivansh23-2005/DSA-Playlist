-- LeetCode Problem: Second Highest Salary
-- Link: https://leetcode.com/problems/second-highest-salary/
-- Difficulty: Medium
-- Language: mysql

# Write your MySQL query statement below
select Max(salary)as SecondHighestSalary from Employee where salary<(select Max(salary) from Employee);