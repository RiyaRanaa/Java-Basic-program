package project_01;
import java.util.*;
public class check_voting_eligibility {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.print("Enter your age ");
		age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Eligible for vote.");
		}
		else
		{
			System.out.println("Not Eligible for vote.");
		}

	}

}
