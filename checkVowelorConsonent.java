package project_01;
import java.util.*;
public class checkVowelorConsonent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.print("Enter any Character ");
		ch=sc.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') 
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonent");
		}
		

	}

}
