package project_01;
import java.util.*;
public class check_no_positive_negative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.print("Enter any Number=");
		num=sc.nextInt();
		
		if(num>0)
		{
			System.out.println("+ve number");
		}
		else if(num<0)
		{
			System.out.println("-ve number");
		}
		else
		{
			System.out.println("Zero");
		}

	}

}
