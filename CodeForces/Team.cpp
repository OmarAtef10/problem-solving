#include <iostream>
using namespace std;

int main() {
    int n;
    cin>>n;
    bool c1,c2,c3;
    int flag =0;
    for (int i = 0; i < n; ++i) {
        cin>>c1>>c2>>c3;
        if (c1+c2+c3>=2){
            flag++;
        }
    }
    cout<<flag;
    return 0;
}
