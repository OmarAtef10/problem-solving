/*#include <iostream>
#include <algorithm>
using namespace std;
*/
/*int main() {
string name;
cin>>name;

sort(name.begin(),name.end());
name.erase(unique(name.begin(),name.end())),name.end();



//int flag = 0 ;
//int x=name.length();
/*for(int i =0; i<x;i++){
    bool unique=false;
    for(int j=1 ;j<x;j++){
        if(name[i]==name[j]){
            unique=true;
            break;
        }
    }
if(unique){
    flag++;
}

}*/
/*
if(name.length()%2==0){
    cout<<"CHAT WITH HER!";
}else{
    cout<<"IGNORE HIM!";
}
    return 0;
}*/


#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main()
{
    string s;
    cin >> s;
    sort(s.begin(), s.end());
    s.erase(unique(s.begin(), s.end()), s.end());
    if (s.length() % 2 == 0)
    {
        cout << "CHAT WITH HER!" << endl;
    }
    else
    {
        cout << "IGNORE HIM!" << endl;
    }
    return 0;
}