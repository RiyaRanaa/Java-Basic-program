package project_01;
import java.util.*;
public class check_divisible_by_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.print("Enter any number=");
		num=sc.nextInt();
		if(num/5==0)
		{
			System.out.println("number is divisible by 5.");
		}
		else
		{
			System.out.println("number is not divisible by 5.");
		}
	}

}
