#include<iostream>
using namespace std;
int bacteria_rate(int m, int n, int req);
int main()
{
  int m,n,req;
  cin>>m>>n>>req;
  int ans=bacteria_rate(m,n,req);
  if(ans>=req)
    cout<<"Doctor, you can proceed with your experiment.";
  else cout<<"Sorry Doctor! You need more bacteria."; 
return 0;}
int bacteria_rate(int m,int n,int req)
{ int p=1;
  for(int i=1;i<=n;i++)
  {  p*=m; 
  }
return p;}