import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class Thing {

  public Thing(){
    println("hi");
    out.println(piNum());
  }
  public void println(String str){
	  out.println(str);
  }
    public void print(String str){
  	  out.print(str);
  }
public double piNum(x){
	double thePi = (double) 1/x;
    return thePi;
}

  public static void main(String[] args){

	  Thing run = new Thing();

  }


}