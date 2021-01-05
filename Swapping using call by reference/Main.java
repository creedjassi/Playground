#include <iostream>
using namespace std;
int swap(int &x,int &y)
{ int temp;
  temp=x;
  x=y;
  y=temp;
  return(0);
 }
int main() 
{
   int a,b,temp;
   cin>>a>>b;
   cout<<"Before swapping "<<"a= "<<a<<" and b="<<b<<"\n";
   swap(a,b);
   cout<<"After swapping " <<"a= "<<a<<" and b="<<b<<"\n";
    return 0;
}