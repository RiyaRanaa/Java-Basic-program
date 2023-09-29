package project_01;
import java.util.*;

public class average_Marks_of_5_subject {

	public static void main(String[] args) {
		System.out.println("Enter your Marks");
		Scanner sc=new Scanner(System.in);
		int MTH,HND,ENG,SCI,SST;
		System.out.print("MTH:");
		MTH=sc.nextInt();
		System.out.print("HND:");
		HND=sc.nextInt();
		System.out.print("ENG:");
		ENG=sc.nextInt();
		System.out.print("SCI:");
		SCI=sc.nextInt();
		System.out.print("SST:");
		SST=sc.nextInt();
		double prcnt=(MTH+HND+ENG+SCI+SST)/5;
		System.out.println("Your Total percentage is: "+prcnt+"%");
		
		

	}

}