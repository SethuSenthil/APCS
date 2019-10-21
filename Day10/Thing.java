import java.util.ArrayList;
import static java.lang.System.*;

public class Thing{
	public Thing(){
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for(int i = 0; i < 10; i++){
			int ranNum = (int) (Math.random() * 25) + 1;
			arr.add(ranNum);
		}


		for(int arrInt : arr){
			System.out.print(arrInt + " ");
		}

		for(int i = arr.size() -1; i > 0; i--){
			 out.print("hi");
			if(arr.get(i) % 2 == 1)
			   arr.remove(i);
		}




		out.println(arr);
	}
	public static void main(String[] args){
        Thing run = new Thing();
	}

}