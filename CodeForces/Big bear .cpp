#include <iostream>
#include <string>
#include<bits/stdc++.h>

using namespace std;

int main(){
    int x,y;
    cin>>x>>y;
    int counter=0;
    do {
        x*=3;
        y*=2;
        counter++;
    } while (y>=x);
    cout<<counter;
    return 0;
}