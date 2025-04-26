package Pack1;
import java.util.Scanner;
public class AtmMachineSimulator {
	Scanner scan=new Scanner(System.in);
	public void m1()
	{
		System.out.println("ATM Machine Simulator");
		System.out.println("--Welcome to Atm--");
		int balance=5000;
		
		for(;;)
		{
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit Money");
			System.out.println("3.Withdraw Money");
			System.out.println("4.Exit");
			
			System.out.println("Enter S.no to use service:");
			
			int service=scan.nextInt();
			switch(service)
			{
			case 1:
			{
				System.out.println("Current Balance: ₹"+balance);
				break;
			}
			case 2:
			{
				System.out.println("Enter Deposit Money:");
				int deposit=scan.nextInt();
				if(deposit>0)
				{
					balance +=deposit;
					System.out.println("Current Balance: ₹"+balance);
					
					
				}
				else {
					System.out.println("Please enter valid amount");
				}
				break;
				
			}
			case 3:
			{
				System.out.println("Enter Withdraw amount");
				int withdraw=scan.nextInt();
				if(balance>withdraw)
				{
					balance -=withdraw;
					System.out.println("Current Balance: ₹"+balance);
					}
				else {
					System.out.println("You have Insufficient balance ");
				}
			break;
				}
			case 4: {
                System.out.println("Thank you for using ATM.");
                return;
            }
			default:
                System.out.println("Invalid choice. Please select between 1 to 4.");
       
			}
		}
			
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AtmMachineSimulator obj=new  AtmMachineSimulator();
		 obj.m1();

	}

}
