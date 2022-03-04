#include <iostream>
#include <string>
#include<bits/stdc++.h>

using namespace std;

int main()
{//soldier and banana
    int k,n,w;
    cin>>k>>n>>w;
    int sum = 0;
    for (int i = 1; i <=w ; ++i) {
        sum=sum + k*i;
    }
//    cout<<sum<<endl;
    if (sum<=n){
        cout<<0;
    }else {
        cout << sum - n;
    }
    return 0;
}