package project_01;
//print the table of any number using for loop
import java.util.*;
public class tableUsingFor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int a=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(a+"*"+i+"="+a*i);
		}

	}

}
