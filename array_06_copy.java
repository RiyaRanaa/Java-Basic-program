package project_01;
import java.util.*;
public class array_06_copy {

	public static void main(String[] args) {
		int a[]=new int[5];
		int b[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Array a=");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\nArray b=");
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
			System.out.print(b[i]+" ");
		}


	}

}
