#include <iostream>
#include <string>
#include "math.h"
#include "vector"
#include "algorithm"
using namespace std;

vector<int> sortedSquares(vector<int>& nums) {

    vector<int>ans;
    for (int i = 0; i <nums.size() ; ++i) {
        ans.push_back(nums[i]*nums[i]);
    }

    sort(ans.begin(), ans.end());

    return ans;

}

int main() {

    vector<int> nums ={-7,-3,2,3,11};
    vector<int> ans = sortedSquares(nums);



    return 0;
}