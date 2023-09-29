package project_01;

public class _04_star_pattern {

	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(k=i;k<=5;k++)
			{
			    System.out.print("*");	
			}
			System.out.println();
		}

	}

}
