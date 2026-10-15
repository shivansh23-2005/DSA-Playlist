-- LeetCode Problem: Combine Two Tables
-- Link: https://leetcode.com/problems/combine-two-tables/
-- Difficulty: Easy
-- Language: mysql

# Write your MySQL query statement below
select Person.firstName,Person.lastName,Address.city,Address.state
from Address right join Person on Person.personId=Address.personId;
