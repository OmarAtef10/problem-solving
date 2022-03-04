#include <iostream>
#include <string>
#include "math.h"
#include "vector"

using namespace std;
int search(vector<int>& nums, int target) {

    int middle = nums.size()/2;
    for (int i = 0; i <= middle; ++i) {
        if (nums[i]==target){
            return i;
        }
    }
    for (int i = middle+1; i <nums.size() ; ++i) {
        if (nums[i]==target){
            return i;
        }
    }
    return -1;
}


int searchInsert(vector<int>& nums, int target) {

    if (search(nums,target)!=-1){
        return search(nums,target);
    }else{
        int i = 0;
        while (target>nums[i]){
            if (i==nums.size()-1){
                return search(nums,nums[i])+1;
            }
            i++;
        }
        return search(nums,nums[i]);
    }
}

int main() {

    vector<int> nums = {3,6,7,8,10};

    vector<int> nums2 = {1,3,5,6};

    int target = 7 ;

    int ans = searchInsert(nums2,target);
    cout<<ans;


    return 0;
}