#include <stdio.h>
#include<conio.h> //1-50=1.40,51-100=2.40,101-200=4.20
//201-300=5.4
           //1-100      Rs.5.50
void main()//101-200  Rs. 9.68
           //201-300  Rs. 12.15
           //301-700  Rs. 20.82
           //Above 700  Rs. 23.92

{
  long ser,cu,pu,unit;
  char name[20];
  float amt;
  clrscr();
  printf("Enter the service no"); 
  scanf("%ld",&ser);
  printf("Enter the name of biller ");
  scanf("%s",&name);
  printf("Enter the previous month reading\n");
  scanf("%ld",&pu);
  current:
  printf("\nEnter the current month reading");
  scanf("%ld",&cu);
  unit=pu-cu;
  if(cu>pu){puts("\a check current month reading");goto current;}
  if(unit<=100)
  {
    amt=unit*5.50;
  }
  
  else if(unit<=200) 
  {
    amt=100*5.50;
    amt=amt+(unit-100)*9.68;
  }
  else if (unit<=300)
  {
    amt=100*5.50;
    amt=amt+100*9.68;
    amt=amt+(unit-200)*12.15;
  }
  else if (unit<=700)
  {
    amt=100*5.50;
    amt=amt+100*9.68;
    amt=amt+100*12.15;
    amt=amt+(unit-300)*20.82;
  }
  else
   {
     amt=100*5.50;
     amt=amt+100*9.68;
     amt=amt+100*12.15;
     amt=amt+400*20.82;
     amt=amt+(unit-700)*23.92;
     
   }
   if(amt<87)amt=87;
   printf("\nThe total bill of this month is %.2f",amt);
   getch();
   }
  