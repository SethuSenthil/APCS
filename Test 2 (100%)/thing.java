public class thing
{

public static void main(String[] args)
{

	int arr[][] = new int[3][3];
	int max = Integer.MIN_VALUE
;
	for(int i = 0; i < arr.length; i++)
	{
		for(int j = 0; j < arr[i].length; j++)
		{
			int ele = arr[i][j];
			int ranNum = (int) (Math.random() * 9) + 2;
			ele = ranNum;
			System.out.print( ele + " ");

			if(ele > max)
			   max = ele;
		}
         System.out.println();
	}
	System.out.println("max num " + max);

}

}