package project_01;
import java.util.*;
public class month_name {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("Enter month number-");
		n=sc.nextInt();
		switch(n)
		{
		case 1:System.out.println("JANUARY-31DAYS");
		break;
		case 2:System.out.println("FEBRUARY-28or29DAYS");
		break;
		case 3:System.out.println("MARCH-31DAYS");
		break;
		case 4:System.out.println("APRIL-30DAYS");
		break;
		case 5:System.out.println("MAY-31DAYS");
		break;
		case 6:System.out.println("JUNE-30DAYS");
		break;
		case 7:System.out.println("JULY-31DAYS");
		break;
		case 8:System.out.println("AUGUST-31DAYS");
		break;
		case 9:System.out.println("SEPTEMBER-30DAYS");
		break;
		case 10:System.out.println("OCTOBER-31DAYS");
		break;
		case 11:System.out.println("NOVEMBER-310DAYS");
		break;
		case 12:System.out.println("DECEMBER-31DAYS");
		break;
		default:System.out.println("Invalid month number");
		break;
		}

	}

}
