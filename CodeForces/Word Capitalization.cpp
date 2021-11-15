#include <iostream>
#include <string>
#include<bits/stdc++.h>

using namespace std;

int main(){
    //word capitalization
    string x ;
    cin>>x;
    if (!isupper(x[0])){
        string y = x.substr(1,x.length()-1);
        x= toupper(x[0]);
        x.append(y);
    }
    cout<<x;
    return 0;
}