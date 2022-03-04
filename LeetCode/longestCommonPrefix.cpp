#include <iostream>
#include <string>
#include "math.h"
#include "vector"

using namespace std;


string longestCommonPrefix(vector<string> &strs) {
    string prefix = "";
    if (strs[0] == "") {
        return "";
    }
    if (strs.size() >= 1) {
        prefix=strs[0];
        for (int i = 1; i < strs.size(); i++) {
            int j=0;
            string cur = strs[i];
            while (cur[j] == prefix[j] && j<prefix.size()){
                j++;
            }
            prefix.resize(j);

            if (j==0){
                return "";
            }
        }
    }
    return prefix;
}

int main() {

    vector<string> vec ;
    vec.push_back("flower");
    vec.push_back("flight");
    vec.push_back("flow");

    string ans = longestCommonPrefix(vec);
    cout<<ans;


    return 0;
}