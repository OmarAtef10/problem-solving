#include <iostream>
using namespace std;

int main() {
int k2,k3,k5,k6;
cin>>k2>>k3>>k5>>k6;
int sum=0;
while(k2  >=1){
    if(k5 >= 1 && k6 >=1){
        sum=sum+256;
        k2--;
        k5--;
        k6--;
    }
    else if( k2>=1 && k3>=1){
        sum=sum+32;
        k2--;
        k3--;
    }else{
        break;
    }
}cout<<sum;

    return 0;
}
