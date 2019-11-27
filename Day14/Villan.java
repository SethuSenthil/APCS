public class Villan extends Super{
	String evalLaugh;
	void hero(String namee, String jobb, String superPowerr, boolean capee, int powerLevell, String evalLaughh ){
		super(namee, jobb, superPowerr, capee, powerLevell);
        evalLaugh = evalLaughh;
	}
	public String getEvalLaugh(){
		return evalLaugh;
	}


}