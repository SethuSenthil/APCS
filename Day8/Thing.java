import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;
import java.util.ArrayList;

public class Thing {

  public Thing(){
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for(int i = 0; i < 15; i++){
		int ranNum = (int) (Math.random() * 986) + 10;
		arr.add(ranNum);
	}
	System.out.println(arr);

	    for(int i = 0; i < arr.size(); i++){
			int elem = arr.get(i);
			if(elem%2 == 1){
				arr.set(i,elem%27);
			}
		}
	System.out.println(arr);

	    for(int i = 0; i < arr.size(); i++){
			int elem = arr.get(i);
			if(elem%2 == 1){
				arr.remove(i);
			}
		}
	System.out.println(arr);

	 int sum = 0;
		    for(int i = 0; i < arr.size(); i++){
				int elem = arr.get(i);
				sum += elem;
		}
		int avg = sum/arr.size();
		out.println("sum: " + sum + "\n avg: " + avg);

  }
    public void print(String str){
  	  out.print(str);
  }

  public static void main(String[] args){

	  Thing run = new Thing();

  }


}