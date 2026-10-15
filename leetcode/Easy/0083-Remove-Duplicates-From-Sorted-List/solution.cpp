// LeetCode Problem: Remove Duplicates from Sorted List
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
// Difficulty: Easy
// Language: cpp

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        ListNode*new_list=head;
        ListNode*temp=head;
        while(temp!=NULL && temp->next!=NULL)
        {
            if(temp->val==temp->next->val)
            {
            temp->next=temp->next->next;
            }
            else
            {
                temp=temp->next;
            }
        }
        return new_list;
    }
};