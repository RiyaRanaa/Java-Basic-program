package project_01;
import java.util.*;
public class reverse_number {

	public static void main(String[] args) {
		int n,reverse;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number-");
		n=sc.nextInt();
		while(n>0) {
			reverse=n%10;
			System.out.print(reverse);
			n=n/10;
		}

	}

}
