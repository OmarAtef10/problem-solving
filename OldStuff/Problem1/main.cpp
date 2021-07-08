#include <iostream>
using namespace std;
int main() {
int n , k;
int counter=0;
cin>>n>>k;
int a[n];
for (int i = 0; i<=n-1;i++ ){
    cin>>a[i];
}
for (int i =0 ;i<=n-1;i++){
    if(a[i]>=a[k-1]&& a[i]>0){
        counter++;
    }

}
cout<<counter;
    return 0;
}
