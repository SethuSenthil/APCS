import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class thing {
	public static void main(String[] args){


		for(int i = 10; i > 5; i--){
			for(int j = i; j > 0; j-=2){
			  out.print(j);
			}
			out.println();

		}

out.println();
out.println();

    printNums(5,4);


	}

	public static void printNums(int value, int numRounds){
		for(int i = 0; i < numRounds; i++){
		 boolean found = false;
		 while(!found){
		 int ranInt = (int)( Math.random() * 9);
		 out.print(ranInt);
		 if(ranInt == value)
		    found = true;
	      }
	    out.println();

		}




	}

}