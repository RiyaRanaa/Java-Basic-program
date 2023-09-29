package project_01;
import java.util.*;
//calculator using switch statement
public class calculatorUsingSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int x=sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int y=sc.nextInt();
		System.out.println("select Operator");
		System.out.println("Addition-a, Subtraction-s, Multiplication-m, Division-d, Remainder-r");
		char ch=sc.next().charAt(0);
		switch(ch) {
		case 'a': System.out.println("Add="+(x+y));
		break;
		case 's':System.out.println("Sub="+(x-y));
		break;
		case 'm':System.out.println("Mul="+(x*y));
		break;
		case 'd':System.out.println("Div="+(x/y));
		break;
		case 'r':System.out.println("Rem="+(x%y));
		break;
		default:
			System.out.println("Invalid");
		}

	}

}
