package project_01;

public class array_01 {

	public static void main(String[] args) {
		// dynamic
        int a[]= {10,20,30,70};
        System.out.println(a[1]);
        //2nd method 
        for(int b:a)
        {
        	System.out.print(b+" ");
        }
        System.out.println();
        //static
        int arr[]=new int[4];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=70;
        for(int i=0;i<=3;i++)
        {
        	System.out.print(arr[i]+" ");
        }
        
	}

}
