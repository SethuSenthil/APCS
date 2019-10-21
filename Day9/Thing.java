import java.util.ArrayList;

public class Thing {
	public Thing(){
		System.out.println("hi");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		System.out.println(arr);
	}
	public static void main(String[] args){
		Thing run = new Thing();
	}
}