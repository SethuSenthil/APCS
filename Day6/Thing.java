import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class Thing {

  public Thing(){
    println("hi");
    println(fact(6) + "");
    println(fib(4) + "");
    println(numLength(90) + "");
  }
  public void println(String str){
	  out.println(str);
  }
    public void print(String str){
  	  out.print(str);
  }
  public int fact(int a){
	  if( a == 0)
	    return 1;
	  return a * fact(a-1);
  }
  public int fib(int a){
	  if( a == 0 || a == 1)
	      return 1;
	   return fib(a-1) + fib(a-2);
  }
  public int numLength(int a){
	  String num = String.valueOf(a);
	  int length = num.length();
 return length;

  }

  public static void main(String[] args){

	  Thing run = new Thing();

  }


}