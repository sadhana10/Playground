#include <stdio.h>
int main() {
	int n;
   scanf("%d",&n);
  for(int i=1;i<=n;i++)
  { for(int k=1;k<=n-i;k++)
    {printf(" ");}
    for(int m=1;m<=i+i-1;m++)
    {printf("*");}
   printf("\n");
  }
	return 0;
}