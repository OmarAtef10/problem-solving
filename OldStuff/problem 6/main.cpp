#include <iostream>
using namespace std;

int main() {
int n;
int counter=0;
cin>>n;
char a[n];
for (int i = 0 ; i<n;i++){

    cin>>a[i];

}
    for (int i = 0 ; i<n;i++){

        if(a[i]==a[i+1]){
            counter++;
        }
    }
cout<<counter;
    return 0;
}
