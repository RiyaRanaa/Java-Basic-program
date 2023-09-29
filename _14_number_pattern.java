package project_01;

public class _14_number_pattern {

	public static void main(String[] args) {
		int i,j,count=0;
        for(i=1;i<=10;i++)
        {
       	 for(j=1;j<=i;j++)
       	 {
       		 count++;
       		 System.out.print(count+" ");
       	 }
       	 System.out.println();
        }

	}

}
