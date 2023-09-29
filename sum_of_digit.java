package project_01;
import java.util.*;
public class sum_of_digit {

	public static void main(String[] args) {
		int n,r,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter any number-");
		n=s.nextInt();
		
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println(sum);

	}

}
