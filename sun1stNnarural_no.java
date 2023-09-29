package project_01;
import java.util.*;
public class sun1stNnarural_no {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter term of no ");
		int n, sum=0;
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of 1st N natural no="+sum);
		

	}

}
