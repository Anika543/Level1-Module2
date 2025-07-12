package _02_smurf;

public class SmurfRunner {
	public static void main (String[] args) {
		Smurf handy = new Smurf("handy ", "white", "boy");
		Smurf papa = new Smurf("papa ", "red", "boy");
		Smurf smurfette = new Smurf("smurfette", "white", "girl");

		System.out.println(handy.getName());
		handy.eat();
		handy.getHatColor();
		handy.isGirlOrBoy(); 
		
		System.out.println();
		
		System.out.println(papa.getName());
		papa.eat();
		papa.getHatColor();
		papa.isGirlOrBoy(); 
		
		System.out.println();
		
		System.out.println(smurfette.getName());
		smurfette.eat();
		smurfette.getHatColor();
		smurfette.isGirlOrBoy(); 
	}
}
