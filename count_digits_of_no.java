package project_01;
import java.util.*;
public class count_digits_of_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n,count=0;
		System.out.print("Enter no ");
		n=sc.nextInt();
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println("digit="+count);
		

	}

}
