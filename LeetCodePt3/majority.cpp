using namespace std;

#include <map>
#include <iostream>
#include "algorithm"
#include <vector>

int getValorNull(map<int, int> &map, int val) {
    auto it = map.find(val);
    if (it->first == map.end()->first && it->second == 0) {
        return 0;
    }
    return val;
}

int majorityElement(vector<int> &nums) {
    map<int, int> hashmap;
    for (int &num : nums) {
        if (getValorNull(hashmap, num) == 0) {
            hashmap.insert(pair<int, int>(num, 1));
        } else {
            auto itr = hashmap.find(num);
            int val = itr->second;
            itr->second = ++val;
        }
    }
    map<int, int>::iterator itr;
    int max = -1;
    int val = 0;
    for (itr = hashmap.begin(); itr != hashmap.end(); ++itr) {
        if (itr->second>max){
            max = itr->second;
            val = itr->first;
        }
    }
    return val;
}

int main() {
    vector<int> vector;
    vector.push_back(1);
    vector.push_back(2);
    vector.push_back(3);
    vector.push_back(3);
    vector.push_back(3);


    cout<<majorityElement(vector);

    return 0;
}
