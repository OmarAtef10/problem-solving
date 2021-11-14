#include <iostream>
#include <string>
#include<bits/stdc++.h>

using namespace std;

int main(){
    //Elephant
    int steps [] = {1,2,3,4,5};
    int x ;
    cin>>x;
    int count=0;
    while (x>0){
        for (int step : steps) {
            if (x>=5){
                x=x-steps[4];
                count++;
            }  else if (x>=4){
                x=x-steps[3];
                count++;
            }  else if (x>=3){
                x=x-steps[2];
                count++;
            }  else if (x>=2){
                x=x-steps[1];
                count++;
            }  else if (x>=1){
                x=x-steps[0];
                count++;
            }
        }
    }
    cout<<count;

    return 0;
}