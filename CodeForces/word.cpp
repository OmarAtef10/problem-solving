#include <iostream>
#include <string>
#include<bits/stdc++.h>

using namespace std;

int main(){
    string word;
    cin>>word;
    int count1=0;/*count2=0;*/
    for (char i : word) {
        if (isupper(i))
            count1++;
//        else
//            count2++;
    }
    string res="";
    if (count1>word.length()/2){
        for (int i =0 ;i<word.length();i++) {
            res+=toupper(word[i]);
        }
    } else{
        for (int i =0 ;i<word.length();i++) {
            res+=tolower(word[i]);
        }
    }
    cout<<res;

    return 0;
}