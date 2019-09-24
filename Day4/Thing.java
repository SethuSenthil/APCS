import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class Thing {

  public Thing(){
   latern();
   out.println();
   latern();
   lineMix();
   starLineThree();
   latern();
   out.println();
   latern();
   starLineOne();
   lineMix();
   lineMix();
   starLineOne();
   starLineOne();

  }
public void starLineOne(){
	 out.println("    *****    ");
}
public void starLineTwo(){
	 out.println("  *********  ");
}
public void starLineThree(){
	 out.println("*************");
}
public void latern(){
  starLineOne();
   starLineTwo();
    starLineThree();
}
public void lineMix(){
	 out.println("* | | | | | *");
}
  public static void main(String[] args){

	  Thing run = new Thing();

  }


}