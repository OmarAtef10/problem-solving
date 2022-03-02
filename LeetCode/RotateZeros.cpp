#include <iostream>
#include <string>
#include "math.h"
#include "vector"
#include "algorithm"

using namespace std;
void moveZeroes(vector<int>& nums) {

    int index = 0 ;
    for (int i = 0; i < nums.size(); ++i) {
        if (nums[i]!=0){
            nums[index]=nums[i];
            if (i!=index){
                nums[i]=0;
            }
            index++;
        }
    }
}

int main() {

    vector<int> nums = {0,1,0,3,12};

    moveZeroes(nums);

    return 0;
}
