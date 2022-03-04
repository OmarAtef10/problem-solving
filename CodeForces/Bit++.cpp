#include <iostream>
using namespace std;

int main() {
    int x =0;
    int n;
    cin>>n;
    string op;
    for (int i = 0; i < n; ++i) {
        cin>>op;
        if (op=="++X")
            ++x;
        else if (op=="X++")
            x++;
        else if (op=="--X")
            --x;
        else if (op=="X--")
            x--;
        else
            return -1;
    }
    cout<<x;
    return 0;
}
