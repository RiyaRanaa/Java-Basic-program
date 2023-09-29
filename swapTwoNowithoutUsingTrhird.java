package project_01;
//swap the two numbers without using the third variable
public class swapTwoNowithoutUsingTrhird {

	public static void main(String[] args) {
		int x=50,y=60;
		System.out.println("Before Swapping: "+x+" "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swapping: "+x+" "+y);

	}

}
