package project_01;
import java.util.*;
public class sumOddOrEvenInRange {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the range ");
		n=s.nextInt();
		if(n%2==0)
		{
			for(int i=0;i<=n;i=i+2)
			{
				sum=sum+i;
			}
			System.out.println("Sum of even="+sum);
		}
		else
		{
			for(int i=1;i<=n;i=i+2)
			{
				sum=sum+i;
			}
			System.out.println("Sum of odd="+sum);
		}

	}

}
