/*#include <iostream>
using namespace std;
int main() {
int n;
cin>>n;
if (n%2==0)
{

     if ((n/2)%2==0) {
        cout<<"YES";
    }
    if((n/2)%2!=0){
        for (int i = 0 ;i <n ; i++){
            for (int j = 0 ;j<n;j++){
                if(j+i==n && j%2==0 && i%2==0){
                    cout<<"YES";
                    return 0;

                }
            }
        }
    }



}
else{
    cout<<"NO";
}

    return 0;
}*/


#include <iostream>

using namespace std;

int main()
{
    int w;
    cin >> w;
    if (w % 2 == 0 && w > 2)
    {
        cout << "YES" << endl;
    }
    else
    {
        cout << "NO" << endl;
    }
    return 0;
}
