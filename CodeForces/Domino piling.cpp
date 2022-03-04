#include <iostream>
using namespace std;

int main() {
    int n,m;
    cin>>n>>m;
    int total=n*m;
    int domino=0;
    for (int i = total; i >0 ; i--) {
        if (i%2==0){
            domino++;
        } else
            continue;
    }
    cout<<domino;
    return 0;
}
