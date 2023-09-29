package project_01;

public class _09_star_pattern {
         
	public static void main(String[] args) {
          int i,j,k;
          for(i=1;i<=5;i++)
          {
         	 for(j=5;j>i;j--)
         	 {
         		 System.out.print(" ");
         	 }
         	 for(k=1;k<=i*2-1;k++)
         	 {
         		 System.out.print("*");
         	 }
         	 System.out.println();
          }
	}
}
