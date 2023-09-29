package project_01;
import java.util.*;
//find the factorial of the number
public class factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number:");
		int a=sc.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
		System.out.println("factorial="+fact);

	}

}
