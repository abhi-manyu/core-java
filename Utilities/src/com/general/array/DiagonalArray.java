package com.general.array;

public class DiagonalArray
{
	
	//printing the diagonal element difference
	public static void main(String[] args)
	{
		int arr[][]={{1,2,3,5,6,7},{2,4,5,7,6,7},{4,4,5,8,6,7},
				           {4,6,8,0,6,7},{4,6,8,0,6,7},{4,6,8,0,6,7}};
		for(int i=0;i<arr.length;i++)
		{
		    for(int j=0;j<arr[i].length;j++)
			 {
			   /*printing all array element
			   System.out.print(arr[i][j]+"  ");*/
				//printing only diagonal elements
					 if(i+j==(arr[i].length-1))
						 System.out.print("* ");
					 else if(i==j)
						 System.out.print("@ ");
					 else
						 System.out.print(arr[i][j]+" ");
		      }
		    System.out.println();
		 }
	}

}
