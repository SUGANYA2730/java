import java.util.*;
public class ATM 
{
  
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int Balance=60000;
		int amount,ch;
		System.out.println("Enter choice:\n 1:Deposit \n 2:Withdraw \n 3:Check balance \n 4:Exit");
        ch=s.nextInt();
        System.out.println("Enter amount:");
        amount=s.nextInt();
        switch(ch)
        {
        	case 1:
        		
        		Balance=Balance+amount;
        		break;
        	case 2:
        		if(amount<=Balance)
        		{
        		Balance=Balance-amount;
        		break;}
        	case 3:
        		System.out.println("Balance :"+Balance);
        		break;
        	case 4:
        		break;
        }
	}

}