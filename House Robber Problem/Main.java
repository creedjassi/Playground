#include<iostream>
using namespace std;
int max_steal(int value[],int N,int i)
{
   if(i>=N)
     return 0;
  return max((value[i]+max_steal(value,N,i+2)),max_steal(value,N,i+1));
}
int max(int a,int b)
{
if(a>b)
  return a;
  else return b;
  return 0;
}
int main()
{
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  cout<<max_steal(a,n,0);
  return 0;
}