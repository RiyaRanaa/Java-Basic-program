package project_01;
import java.util.*;
public class array_07_sum {

	public static void main(String[] args) {
		int a[]=new int[5];int sum=0; 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Array a=");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			sum=a[i]+sum;
		}
		
			System.out.print("\nSum a="+sum);
		

	}

}
