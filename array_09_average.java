package project_01;
import java.util.*;
public class array_09_average {

	public static void main(String[] args) {
		int a[]=new int[5];
		int sum=0;double avg;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("\nArray a ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			sum=a[i]+sum;
		}
		avg=sum/5.0;
		System.out.print("\nAdd="+sum+"\navg="+avg);
		

	}

}
