package project_01;

public class _11_star_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i,j;
       for(i=1;i<=5;i++)
       {
    	   for(j=1;j<=i;j++)
    	   {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
       
       for(i=1;i<=4;i++)
       {
    	   for(j=4;j>=i;j--)
    	   {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
	}

}
