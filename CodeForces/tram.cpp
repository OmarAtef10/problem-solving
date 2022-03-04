#include <iostream>
#include <string>
#include<bits/stdc++.h>

using namespace std;

int main(){
    //tram
    int num ;
    cin>>num;
    int a,b;
    int cap = 0 ;
    int suff=cap;
    for (int i = 0; i < num; ++i) {
        cin>>a>>b;
        cap+=(b-a);
        suff= max(suff,cap);
    }
    cout<<suff;
    return 0;
}