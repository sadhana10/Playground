#include <stdio.h>
int main(){
	// Type your code here
  int r,k=1;
  scanf("%d",&r);
  for(int i=1;i<=r;i++)
  {
    for(int l=0;l<i;l++)
    {if(k%2==1)
    {printf("*");
     k++;}
     else
     {
       printf("#");
       k++;}
     

    }
    printf("\n");
  }
       
  	return 0;
}