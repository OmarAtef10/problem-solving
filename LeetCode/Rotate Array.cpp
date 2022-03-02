#include <iostream>
#include <string>
#include "math.h"
#include "vector"
#include "algorithm"

using namespace std;
void rotate(vector<int> &nums, int k) {
    k = k % nums.size();
    reverse(nums.begin(),nums.begin()+nums.size()-k);
    reverse(nums.begin()+nums.size()-k, nums.end());
    return reverse(nums.begin(), nums.end());
}


int main() {

    vector<int> nums = {1,2,3,4,5,6,7};
    rotate(nums, 3);


    return 0;
}