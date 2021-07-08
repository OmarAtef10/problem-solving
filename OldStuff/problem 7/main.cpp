#include <iostream>
#include <cmath>
using namespace std;


int main() {
int a[5][5];
int movex=0 , movey=0;
int res=0;
int x,y;
for (int i =0 ; i<5 ;i++){
    for (int j =0 ; j<5 ;j++){
        cin>>a[i][j];


    }
    cout<<endl;

}
for (int i =0 ; i<5 ;i++){
        for (int j =0 ; j<5 ;j++){
            if(a[i][j]==1){
                cout<< "index is "<<i<<" and "<<j;
                x=i;
                y=j;
            }

        }
        cout<<endl;

    }

res=abs(x-3)+abs(y-3);
cout<<res;
    return 0;
}


/*#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <cstdio>
#include <math.h>
#include <string>

using namespace std;



int main() {
    int temp[6][6];
    int x = 0;
    int y = 0;
    for (int i = 1; i <= 5; ++i) {
        for (int j = 1; j <= 5; ++j) {
            scanf("%d", &temp[i][j]);
            if (temp[i][j] == 1) {
                x = i;
                y = j;
            }
        }
    }
    printf("%d\n", abs(x - 3) + abs(y - 3));
    //system("pause");
    return 0;
}*/