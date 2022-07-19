using namespace std;

#include <iostream>
#include "algorithm"


int main() {

    int n, t, k, d;
    cin >> n >> t >> k >> d;

    int times = (n + k - 1) / k;
    int o1 = 0, o2 = d;
    for (int i = 0; i < times; ++i) {
        if (o1 <= o2) o1 += t;
        else o2 += t;
    }
    if (max(o1,o2)<times*t) cout<<"YES";
    else cout<<"NO";

    return 0;
}
