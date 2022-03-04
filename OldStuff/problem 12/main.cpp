#include <iostream>
using namespace std;

int main() {
int a1,a2,a3,b1,b2,b3,n,cups,medals,counter=0;
cin>>a1>>a2>>a3;
cin>>b1>>b2>>b3;
cin>>n;
cups=a1+a2+a3;
medals=b1+b2+b3;
while(cups>0){
    cups-=5;
    counter++;
}
    while(medals>0){
        medals-=10;
        counter++;

    }
    if(counter<=n)
    { cout<<"YES"<<endl;}
    else
    {cout<<"NO"<<endl;}

    return 0;
}
