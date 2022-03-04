#include <iostream>
#include <string>
#include "math.h"
#include "vector"

using namespace std;

int firstBadVersion(int n) {

    if (n == 0)
        return 0;
    int start = 1;
    int middle = n / 2;
    int bad = 1;
    int count = 1;

    while (start<=middle){
        if (count==bad){
            return count;
        }
        count++;
    }
    while (middle+1<=n){
        if (count==bad){
            return count;
        }
        count++;
    }

    return 0;
}

int main() {

    int ans = firstBadVersion(1);
    cout<<ans;


    return 0;
}