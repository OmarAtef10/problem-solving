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


int main() {

    vector<int> nums = {-1,0,3,5,9,12};

    int target = 2 ;

    int ans = search(nums,target);
    cout<<ans;


    return 0;
}