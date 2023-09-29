package project_01;
import java.util.*;
public class area_of_circle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int radius;
		System.out.print("Enter radius=");
		radius=sc.nextInt();
		double area=Math.PI*radius*radius;
        System.out.println("Area of circle="+area);
	}

}
