package project_01;

public class _07_star_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int i,j,k;
         for(i=1;i<=5;i++)
         {
        	 for(j=5;j>i;j--)
        	 {
        		 System.out.print(" ");
        	 }
        	 for(k=1;k<=i;k++)
        	 {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
	}

}
