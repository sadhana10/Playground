#include <stdio.h>
int main() {
	int n;
  int l=1;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  { for(int m=1;m<=n-i;m++)
    { printf(" ");}
   for(int k=1;k<=i;k++)
   {printf("%d ",l);l++;}
   printf("\n");
  }
     
    
	return 0;
}