// ProblemSolving.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

using namespace std;
#include <iostream>
#include "algorithm"


struct ListNode {
    int val;
    ListNode* next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode* next) : val(x), next(next) {}

};


ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
    if (list1 == nullptr and list2== nullptr){
        return list1;
    }

    if (list1 == nullptr){
        return list2;
    }
    if (list2== nullptr){
        return list1;
    }

    if (list1->val<=list2->val){
        list1->next = mergeTwoLists(list1->next,list2);
        return list1;
    } else{
        list2->next = mergeTwoLists(list1,list2->next);
        return list2;
    }

}

int main()
{

    return 0;
}
