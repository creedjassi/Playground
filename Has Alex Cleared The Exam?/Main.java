#include<iostream>
using namespace std;
int main()
{ int n,alex,c=0;
  cin>>n;
  int roll_no[n];
  for(int i=0;i<n;i++)
    cin>>roll_no[i];
  cin>>alex;
  for(int i=0;i<n;i++)
    if(alex==roll_no[i])
     {cout<<"She passed her exam"; 
       c++;}
   if(c==0)
     cout<<"She failed";
 return 0;
  // Type your code here
}