package project_01;
import java.util.*;
public class area_of_traingle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,s;//s=semi perimeter
		double area;
		System.out.println("Enter value of side");
		System.out.print("a=");
		a=sc.nextInt();
		System.out.print("b=");
		b=sc.nextInt();
		System.out.print("c=");
		c=sc.nextInt();
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of traingle="+area);
        
        System.out.println("Enter base and height value");
        int base,height;//area of traingle=(1/2)*base*height;
        int area1; 
        System.out.print("Base=");
        base=sc.nextInt();
        System.out.print("Height=");
		height=sc.nextInt();
		area1=(base*height)/2;
		System.out.println("Area of traingle="+area1);
		
	}

}
