import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class thing {
	public static void main(String[] args){
		int[][] arr = new int[2][20];
		int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
		int sum = 0;

        for(int i = 0; i <= arr.length - 1; i++){
		    for(int j = 0; j <= arr[i].length -1; j++){

			int ranNum = (int) (Math.random() * 100) + 1;
            int ele = arr[i][j];
            ele = ranNum;
            sum += ele;
            out.print(ele + " ");
            if(ele > max)
               max = ele;

            if(ele < min)
                min = ele;

	         }
	         System.out.println();
		}
		out.println("sum:" + sum);
		out.println("smallest num" + min);
		out.println("biggest num" + max);

        for(int i = arr[i].length -1; i >= 0 ; i++){
		    for(int j = arr[i].length -1; j >= 0; j--){
            int ele = arr[i][j];

	         }
	         System.out.println();
		}

	         System.out.println();
	         System.out.println();
	         System.out.println();


}
}