package project_01;
import java.util.*;
public class armstrong_or_not {

	public static void main(String[] args) {
		int n,r,c,arm=0;
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter any number-");
	   n=sc.nextInt();
	   c=n;
	   
	   while(n>0)
	   {
		   r=n%10;
		   arm=(r*r*r)+arm;
		   n=n/10;
	   }
	   if(c==n)
	   {
		   System.out.println("Armstong Number");
	   }
	   else
	   {
		   System.out.println("Not Armstong Number");
	   }

	}

}
