package project_01;
//find the largest no two and three numbers.
public class findLargestOfThreeNO {

	public static void main(String[] args) {
		int a=20,b=10;
		int largest1=(a>b)?a:b;
		System.out.println("Largest of two numbers is: "+largest1);
		int c=60;
		int largest2=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println("Largest of three numbers is: "+largest2);

	}

}
