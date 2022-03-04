#include <iostream>
using namespace std;
int main() {
    int n,x;
    cin>>n>>x;
    int counter=0;
    int a[n][n];
    for  (int i = 1 ;i<n+1;i++){
        for (int j=1;j<n+1;j++){
            a[i][j]=i*j;
        }
    }
    for  (int i = 1 ;i<n+1;i++){
        for (int j=1;j<n+1;j++){
            if(a[i][j]==x){
                counter++;


            }

            // cout<<a[i][j]<<" ";



        }

        // cout<<endl;

    }

    cout<<counter;
    return 0;
}
