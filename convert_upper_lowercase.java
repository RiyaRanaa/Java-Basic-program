package project_01;
import java.util.*;
public class convert_upper_lowercase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch,ch1;
		System.out.print("Enter any character-");
		ch=sc.next().charAt(0);
		
		if(ch>='A'&&ch<='Z')
		{
			ch1=Character.toLowerCase(ch);
			System.out.println("Lwercase-"+ch1);
		}
		else
		{
			ch1=Character.toUpperCase(ch);
			System.out.println("Uppercase-"+ch1);
		}
	}

}
