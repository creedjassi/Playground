#include<iostream>
using namespace std;
int main()
{ int n,max;
  cin>>n;
  int marks[n];
  for(int i=0;i<n;i++)
     cin>>marks[i];
  max=marks[0];
  for(int i=1;i<n;i++)
     if(marks[i]>max)
        max=marks[i];
  cout<<max;
 return 0;
  // Type your code here
}