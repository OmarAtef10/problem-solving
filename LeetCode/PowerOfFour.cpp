#include <iostream>
#include <string>
#include "math.h"
using namespace std;

bool isPowerOfFour(int n){
    if (n==1){
        return true ;
    }
    if (n<=0){
        return false;
    }
    if (log10(n)/ log10(4) - int(log10(n)/ log10(4))==0 ){
        return true;
    } else{
        return false;
    }
}
int main() {
    bool res = isPowerOfFour(0);
    cout<<res;

    return 0;
}