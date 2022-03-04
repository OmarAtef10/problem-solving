#include <iostream>
#include <string>
#include<bits/stdc++.h>

using namespace std;

int main()
{

    string a,b;
    cin>>a>>b;
    transform(a.begin(), a.end(), a.begin(), ::tolower);
    //cout << a << endl;

    transform(b.begin(), b.end(), b.begin(), ::tolower);
    //cout << b << endl;

    if (a==b)
        cout<<"0";
    if (a>b)
        cout<<"1";
    if (a<b)
        cout<<"-1";
    return 0;
}