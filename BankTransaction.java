import java.util.*;
import java.lang.*;
public class BankTransaction
{
 public static void main(String[] args)
{
  int balance=2000,amount,withdraw,yourpin=5454,enteredpin,credit,n;
  String PAN="ADFC1234",PAN1;
  String name;
Scanner sc=new Scanner(System.in);
for(;;)//while(true)
{
  System.out.println("Welcome to coding bank of india");
  System.out.println("Enter your secret pin");
  enteredpin=sc.nextInt();
  if(yourpin==enteredpin)
  {
           System.out.println("Please enter your name");
             sc.nextLine();
            name=sc.nextLine();
         System.out.println("welcome "+" "+name+" "+"to Coding bank");
     System.out.println("choose a option given below");
  }
else
{
System.out.println("Invalid pin entered please try again");
 continue;
}
 System.out.println("press 1 for withdraw\npress 2 for checking balance\npress 3 for credit\npress 4 for exit");  
n=sc.nextInt();
  switch(n)
  {
   case 1:System.out.println("Enter how much amount you want to withdraw???");
            amount=sc.nextInt();
            if(amount<balance)
           {
            balance= balance-amount;
            System.out.println("Successfully"+" "+amount+" "+"is withdrawn\n");
             }
           else
           System.out.println("Error:Insufficent balance please check your balance\n\n");
           break;
   case 2:System.out.println("your balance amount is");
           System.out.println(balance);
          break;
   case 3:System.out.println("Enter how much amount you want to credit to your account???");
           credit=sc.nextInt();
            if(credit<=50000)
             { 
             balance=balance+credit;
             System.out.println("Successfully"+" "+credit+" "+"is credited\n");
             }
            else
              {
              System.out.println("Alert:your entered amount exceeded your deposit limit\n"); 
              System.out.println("Please enter PAN Number\n");
             PAN1=sc.next();
           if(PAN1.equals(PAN))
          { 
           if(credit>50000)
            {
            balance=balance+credit;
            System.out.println("Successfully"+" "+credit+" "+"is credited\n");
             }
            else
            System.out.println("No need of pan");
          }
            
           
           else
           System.out.println("Invalid PAN  entered");
           }     
             
            break;              
   case 4:System.out.println("Thank you for using our coding bank please visit again");
          System.exit(0);

}  

}
 
}
   }
