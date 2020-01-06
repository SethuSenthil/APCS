public class Super extends Person{
	private String superPower;
	private boolean cape;
	private int powerLevel;
	private int hitPointl;
	private int maxDamage;

	void Super(String namee, String jobb, String superPowerr, boolean capee, int powerLevell, String heroName){
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
		public int getHitPoint(){
				return hitPoint;
			}
	public int getmxDamage(){
					return maxDamage;
				}
		public void(int val){
			maxDamage -= val;

		}




}