#include<iostream>
using namespace std;
#include<string>
int main()
{
  int a,b,c,d=0;
  cin>>a>>b>>c;
  string A=to_string(a),B=to_string(b),C=to_string(c);
  int H[10]={0};
  for(int i=0;i<A.size();i++)
  {  if(d==0) 
    {if(A[i]<B[i] && A[i]<C[i])
       {cout<<A[i];
       }
     else{ if(B[i]<A[i] && B[i]<C[i])
              cout<<B[i];
           else cout<<C[i];
         }
     d++;
     }
    else {if(A[i]>B[i] && A[i]>C[i])
       {cout<<A[i];
       }
     else{ if(B[i]>A[i] && B[i]>C[i])
              cout<<B[i];
           else cout<<C[i];
         }
          d=0;
     }
   }
  return 0;
}
        