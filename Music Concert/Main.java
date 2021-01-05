#include<iostream>
using namespace std;
#include<cstdlib>
int main(){
  int *p,n,e=0,o=0;
  cin>>n;
  p=(int *)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
    cin>>*(p+i);
  for(int i=0;i<n;i++)
   { if(*(p+i)%2==0)
       e++;
    else{o++;}
   }
  cout<<o<<endl;
  cout<<e;
  free(p);
  return 0;
}