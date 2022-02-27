#include <iostream>
#include <string>
#include "vector"
using namespace std;

vector<int> twoSum(vector<int> &nums , int target){
    int  sum = 0;
    vector<int> res;
    for (int i = 0; i < nums.size(); i++) {
        sum+= nums[i];
        res.push_back(i);
        for (int j = i+1; j <nums.size() ; j++) {
            if(sum + nums[j]==target){
                res.push_back(j);
                return res;
            }
        }
        sum = 0;
        res.clear();
    }
    return res;
}
int main() {

    vector<int>nums;
    nums.push_back(3);
    nums.push_back(2);
    nums.push_back(4);

    int target = 6;

    vector<int>res = twoSum(nums,target);



    return 0;
}