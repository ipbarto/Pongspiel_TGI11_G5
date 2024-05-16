package packageSW27;

public class Class_Bot {
	private String weaponString;
	private String[] choose = new String[3];
	
	
	public String getWeaponString() {
		return weaponString;
	}
	
	public void setWeaponString() {
		choose[0] = "Schere";
		choose[1] = "Stein";
		choose[2] = "Papier";
		
		int rand = (int)Math.floor(Math.random() *(2 - 0 + 1) + 0);
		
		weaponString = choose[rand];
	}
}
