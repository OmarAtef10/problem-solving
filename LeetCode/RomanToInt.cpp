#include <iostream>
#include <string>
#include "vector"
#include <map>

using namespace std;


int romanToInt(string s) {
    int res = 0;
    map<char, int> roman;
    roman.insert(pair<char, int>('I', 1));
    roman.insert(pair<char, int>('V', 5));
    roman.insert(pair<char, int>('X', 10));
    roman.insert(pair<char, int>('L', 50));
    roman.insert(pair<char, int>('C', 100));
    roman.insert(pair<char, int>('D', 500));
    roman.insert(pair<char, int>('M', 1000));

    for (int i = 0; i < s.size(); i++) {
        if (s[i] == 'I') {
            if (s[i + 1] == 'V') {
                res += 4;
                i++;
            } else if (s[i + 1] == 'X') {
                res += 9;
                i++;
            }else {
                res += roman.at(s[i]);
            }
        }else if(s[i]=='X'){
            if (s[i + 1] == 'L') {
                res += 40;
                i++;
            } else if (s[i + 1] == 'C') {
                res += 90;
                i++;
            }else {
                res += roman.at(s[i]);
            }
        }
        else if(s[i]=='C'){
            if (s[i + 1] == 'D') {
                res += 400;
                i++;
            } else if (s[i + 1] == 'M') {
                res += 900;
                i++;
            }else {
                res += roman.at(s[i]);
            }
        }
        else {
            res += roman.at(s[i]);
        }
    }
    return res;
}

int main() {

    string s = "MCMXCIV";
    int res = romanToInt(s);
    cout<<res;

    return 0;
}