package project_01;
import java.util.*;
public class array_04_reverse {

	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array element ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Array element ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.print("\nReverse ");
		for(int i=5-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
