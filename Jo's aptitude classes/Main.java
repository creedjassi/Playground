#include<iostream>
using namespace std;
int main()
{
    int a,b,c,gcd1=0,res,ans,small;
    cin>>a>>b>>c>>ans;
    if(a<b&&a<c)
      small=c;
    else{ if(b<a&&b<c)
            small=b;
           else small=c;
        }
    for(int i=1;i<=small;i++)
    {  int res=small/i;
      if(a%res==0 && b%res==0 && c%res==0)
          if(ans==res)
          {cout<<"Answer is correct."; gcd1=1; break;
          }
    }
    if(gcd1==0)
      cout<<"Answer is wrong.";
  return 0;
}