package Pack1;
import java.util.Scanner;
public class MultiplicationTableGenerator {
	Scanner scan=new Scanner(System.in);
	public void m1()
	{
		System.out.println("Multiplication Table Generator");
		System.out.println("Enter a table-no you want generate:");
		int no=scan.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(no+"*"+i+"="+(i*no));
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplicationTableGenerator obj=new MultiplicationTableGenerator();
		obj.m1();
		

	}

}
