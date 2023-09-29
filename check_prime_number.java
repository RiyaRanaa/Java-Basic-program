package project_01;
import java.util.*;
public class check_prime_number {

	public static void main(String[] args) {
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number-");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++) 
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime Number");
		}

	}

}
