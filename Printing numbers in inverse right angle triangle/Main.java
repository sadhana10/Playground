#include <stdio.h>
int main() {
    // Type your code here
  int n;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  { for(int k=n-i+1;k>=1;k--)
  {printf("%d",k);}
   printf("\n");
  }
   
   
    
	return 0;
}