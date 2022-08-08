using namespace std;

#include <iostream>
#include "algorithm"
#include <vector>

int main() {
    int dist, numOfcity, pos, sum = 0;
    cin >> numOfcity >> pos;
    vector<int> arr(numOfcity+1);
    for(dist = 1 ; dist<=numOfcity;dist++){
        cin>>arr[dist];
        sum+=arr[dist];
    }
    for(dist = 1; dist<pos && dist<=numOfcity-pos ; dist++){
        if(arr[pos+dist]+arr[pos-dist]==1){
            sum--;
        }
    }
    cout<<sum;
    return 0;
}
