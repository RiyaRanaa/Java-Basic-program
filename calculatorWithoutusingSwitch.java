package project_01;
import java.util.*;
public class calculatorWithoutusingSwitch {

	public static void main(String[] args) {
		int x,y,cal;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number ");
		x=sc.nextInt();
		System.out.print("Enter 2nd number ");
		y=sc.nextInt();
		System.out.println("Select Operator");
		System.out.println("ADDITION-A, SUBTRACTION-S, MULTIPLICATION-M, DIVISION-D, REMAINDER-R");
		char ch=sc.next().charAt(0);
		if(ch=='A')
		{
			cal=x+y;
			System.out.println("ADDITION="+cal);
		}
		else if(ch=='S')
		{
			cal=x-y;
			System.out.println("SUBTRACTION="+cal);
		}
		else if(ch=='M')
		{
			cal=x*y;
			System.out.println("MULTIPLICATION="+cal);
		}
		else if(ch=='D')
		{
			cal=x/y;
			System.out.println("DIVISION="+cal);
		}
		else
		{
			cal=x%y;
			System.out.println("REMAINDER="+cal);
		}

	}

}
