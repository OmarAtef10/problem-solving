#include <iostream>
using namespace std;

int main() {
    int counter=0;
int n;
cin>>n;
bool a[n];
for (int i = 0 ; i<n;i++){
    cin>>a[i];

}

for (int i = 0 ; i <n ; i++) {
    if (a[i] == 1) {
        counter++;
    }
}
    if(counter>0){
        cout<<"HARD";

    }
    else{
        cout<<"EASY";
    }



    return 0;
}
