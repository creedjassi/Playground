#include<iostream>
using namespace std;
int digitroot(int n)
{ 
  if(n<=9)
    return n;
  else{
    return digitroot(n%10 + digitroot(n/10));
   }
}
int main()
{ int n;
  cin>>n;
  cout<<digitroot(n);
 return 0;
 }