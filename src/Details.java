import java.util.Scanner;
public class Details
{
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    Bank b = new Bank("Satish",123456789,100000);
	   
	    System.out.print("Account Number is: ");
	    System.out.println(b.getAcn());
	   
	    System.out.print("Balance Amount is: ");
	    System.out.println(b.getBalance());
	    
	 
	    
	   boolean trans = true;
	    
	   while(trans)
	    {
		   System.out.print("Enter Choice: ");
		   int choice = sc.nextInt();
		 
	    	
	    	switch(choice)
	    	{
	    	case 1:
	    		b.deposit(sc);
	    		break;
	    	case 2:
	    		b.withdraw(sc);
	    		break;
	    	default:
	    		trans = false;
	    		break;
	    		
	    	}
	    	if(trans)
	    	{
	    		System.out.print("Press 1 for continue the transaction: ");
	    		int j = sc.nextInt();
	    		if(j !=1)
	    		{
	    			trans =false;
	    		}
	    	}
	    }  
	    
	    System.out.println("Thank you.....Have a nice day");
	}
}
class Bank{
    private String name;
    private long acn;
   private int bal;
  
  
   
   public Bank(String name,long acn,int bal)
   {
       this.name = name;
       this.acn = acn;
       this.bal = bal;        
     
   }
  
      public void deposit(Scanner sc)
        {
            System.out.println("Please Enter the Deposit Amount : ");
            int x = sc.nextInt();
            bal = bal+x;
            System.out.print("Transaction Done.....Available Balance is :");
            System.out.println(bal);
            
        }
      public  void withdraw(Scanner sc)
        {
            System.out.print("Please Enter the Withdrawl Amount : ");
            int y = sc.nextInt();
            if(y<=bal)
            {
                  bal = bal-y;
                  System.out.print("Transaction Done.....Available Balance is :");
                  System.out.println(bal);
                
            }
            else{
                System.out.println("Insufficient Balance......");
            }
          
        }
  
     
   String getName()
   {
       return name;
   }
   long getAcn()
   {
       return acn;
   }
  
   int getBalance()
   {
       return bal;
   }
}



	    
	   
	    
	 
	   
	
		
	
