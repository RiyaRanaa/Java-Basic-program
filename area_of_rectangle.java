package project_01;
import java.util.*;
public class area_of_rectangle {

	public static void main(String[] args) {
		int l,b,area;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Length=");
		l=sc.nextInt();
		System.out.print("Enter Breath=");
		b=sc.nextInt();
		area=l*b;
		System.out.println("Area of rectangle="+area);

	}

}
