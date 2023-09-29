package project_01;
import java.util.*;
public class tax_of_salary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int salary;
		double tax;
		System.out.print("Enter your Salary ");
		salary=sc.nextInt();
		if(salary<=10000)
		{
			System.out.println("No Tax");
		}
		else if(salary>10000&&salary<=100000)
		{
			tax=salary*0.10;
			System.out.println("Tax="+tax);
		}
		else
		{
			tax=salary*0.20;
			System.out.println("Tax="+tax);
		}
		

	}

}
