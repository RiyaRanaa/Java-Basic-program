package project_01;
import java.util.*;
public class palindrome_or_not {

	public static void main(String[] args) {
		int n,sum=0,c,r;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number-");
		n=sc.nextInt();
		c=n;
		
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(c==sum)
		{
			System.out.println("Yes palindrome number.");
		}
		else
		{
			System.out.println("Not palindrome number.");
		}

	}

}
