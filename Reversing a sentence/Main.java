#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum string size
int main()
{
    char str[100], reverse[100];
    int len, i, index, WordStart, WordEnd;
    gets(str);
    len = strlen(str);
    index = 0;
    // Start checking of words from the end of string
     WordStart = len - 1;
     WordEnd   = len - 1;
     while(WordStart > 0)
     {
          // If a word is found
          if(str[WordStart] == ' ')
          {
             // Add the word to the reverse string
             i = WordStart + 1;
             while(i <= WordEnd)
             {
                 reverse[index] = str[i];
               
                  i++;
                  index++;
             }
             reverse[index++] = ' ';
             WordEnd = WordStart - 1;
          }
       WordStart--;
     }
     // Finally add the last word
     for(i=0; i<=WordEnd; i++)
     {
         reverse[index] = str[i];
         index++;
     }
     // Add NULL character at the end of reverse string
     reverse[index] = '\0';
     printf("%s", reverse);
     return 0;
}