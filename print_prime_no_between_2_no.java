package project_01;
import java.util.*;
public class print_prime_no_between_2_no {

	public static void main(String[] args) {
		int n,m,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two number-");
		n=sc.nextInt();
		m=sc.nextInt();
		
		for(int i=n;i<=m;i++)
		{
			for(j=2;j<=i;j++)
			{
				if(i%j==0)
				break;
			}
			if(i==j)
				System.out.print(j+" ");
		}
		

	}

}
