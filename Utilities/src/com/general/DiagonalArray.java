package com.general;

public class DiagonalArray
{
	
	//printing the diagonal element difference
	public static void main(String[] args)
	{
		int arr[][]={{1,2,3,5},{2,4,5,7},{4,4,5,8},
				           {4,6,8,0}};
		for(int i=0;i<arr.length;i++)
		{
		    for(int j=0;j<arr[i].length;j++)
			 {
			   /*printing all array element
			   System.out.print(arr[i][j]+"  ");*/
				//printing only diagonal elements
					 if(i+j==(arr[i].length-1) || i==j)
						 System.out.print("* ");
					 else
						 System.out.print(arr[i][j]+" ");
		      }
		    System.out.println();
		 }
	}

}
