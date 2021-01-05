#include<iostream>
using namespace std;
#include<bits/stdc++.h>
int sum=0;
int apple(int c,int n)
{  sum+=12*pow(n,2);
   if(sum>=c)
      return n;
   return(apple(c,n+1)); 
}
int main()
{  int appl;
   cin>>appl;
	cout<<(apple(appl,0)*2)*4;
	return 0;
}