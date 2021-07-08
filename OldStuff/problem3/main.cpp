#include <iostream>
#include <vector>
using namespace std;
int vis[101];
int main() {
    int n, k;
    cin >> n >> k;
    vector<int>v;

    for (int i = 1; i <= n; i++) {
        int x; cin >> x;

        if (!vis[x])v.push_back(i);
        vis[x]++;
    }
    if (v.size() < k)cout << "NO\n";
    else {
        cout << "YES\n";
        for (int i = 0; i < k; i++)cout << v[i] << " ";
    }

}