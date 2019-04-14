#include <stdio.h>
int main(){
	// Type your code here
  int r;
  scanf("%d",&r);
  for(int i=1;i<=r;i++)
  {
    for(int k=0;k<r;k++)
    {
      printf("%d",i);
    }
    printf("\n");
  }
  	return 0;
}