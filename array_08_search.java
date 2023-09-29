package project_01;
import java.util.*;
public class array_08_search {

	public static void main(String[] args) {
		int a[]=new int[5];
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array a ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("\nArray a=");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\nEnter search element ");
		n=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				count++;
			}
		}
		if(count>0)
			System.out.print("Found "+count+" times");
		else
			System.out.print("Not Found");

	}

}
