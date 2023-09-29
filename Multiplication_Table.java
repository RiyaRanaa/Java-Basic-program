package project_01;
import java.util.*;
public class Multiplication_Table {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number ");
		num=sc.nextInt();
		for(int i=1;i<=10;i++) 
		{
			System.out.println(num+"*"+i+"="+num*i);
		}
		

	}

}
