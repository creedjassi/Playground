#include <iostream>
int main()
{
char str[100];    
int count = 0;                   
std::cin.getline(str,100);
 for(int i=0;i<100;i++)
    if(str[i]!='\0')
        count++;
    else{break;}
--count;
 for(int i=0;i<=count;i++)
    std::cout<<str[count-i];
  return 0;
}