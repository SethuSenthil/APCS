public class Super extends Person{
	String superPower;
	boolean cape;
	int powerLevel;
	void Super(String namee, String jobb, String superPowerr, boolean capee, int powerLevell){
		super(namee,jobb);
		superPower = superPowerr;
		cape = capee;
		powerLevel = powerLevell;
	}
     public String getSuperPower(){
		return superPower;
	}
	public boolean getCape(){
		return cape;
	}
	public int getPoerrLevel(){
			return powerLevel;
		}


}