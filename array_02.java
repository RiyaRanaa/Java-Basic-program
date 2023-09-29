package project_01;
import java.util.*;
public class array_02 {

	public static void main(String[] args) {
		int size,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Size ");
		size=sc.nextInt();
		int a[]=new int[size];
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Array ");
		for(i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
