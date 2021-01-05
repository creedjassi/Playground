#include<iostream>
using namespace std;
int armstrong(int n);
int power(int digit, int count);
int main()
{ int n;
  cin>>n;
  if(armstrong(n)==1)
   cout<<"Kindly proceed with encrypting";
  else cout<<"It is not an Armstrong number";
return 0;}
int armstrong(int n)
{
  int sum=0,n1=n,c=0;
  while(n1!=0)
  { c++; n1/=10;
  }
  n1=n;
  while(n1!=0)
  { sum+=power(n1%10,c);
    n1/=10;
  }
  if(sum==n)
    return 1;
  return 0;}
int power(int digit,int count)
{ int p=1;
  for(int i=1;i<=count;i++)
      p*=digit;
  return p;
}