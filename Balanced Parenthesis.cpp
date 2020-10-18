#include<iostream>
using namespace std;
#include <stack>        //Using Inbuilt Stack

bool Balanced_parenthesis(string s){

    stack<char> s1;

    for(int i=0;i<s.size();i++){

        if(s[i]=='{' || s[i] == '[' || s[i]=='('){
            s1.push(s[i]);
           }
        else if(s[i]==')'){
            if(s1.top()=='('){
                s1.pop();
               }
               else{
                return false;
               }
        }
        else if(s[i]=='}'){
            if(s1.top()=='{'){
                s1.pop();
               }
               else{
                return false;
               }
        }
        else if(s[i]==']'){
            if(s1.top()=='['){
                s1.pop();
               }
               else{
                return false;
               }
        }

    }

    if(s1.empty()){
        return true;
    }
    else{
        return false;
    }

}

int main(){


    string s;
    cin>>s;

    cout<<Balanced_parenthesis(s)<<endl;


}
