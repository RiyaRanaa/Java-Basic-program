package project_01;
import java.util.*;
public class powerOfNumber {

	public static void main(String[] args) {
		int n,p,result=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no ");
		n=sc.nextInt();
		System.out.print("Enter power ");
		p=sc.nextInt();
        for(int i=1;i<=p;i++) {
        	result=n*result;
        }
        System.out.println(result);
	}

}
