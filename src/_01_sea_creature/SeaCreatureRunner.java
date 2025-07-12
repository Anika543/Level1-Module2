package _01_sea_creature;

public class SeaCreatureRunner {
	public static void main (String[] args) {
		SeaCreature spongebob = new SeaCreature("Spongebob"); 
		spongebob.eat();
		spongebob.laugh(); 
		
		SeaCreature patrick = new SeaCreature("Patrick"); 
		SeaCreature squidward = new SeaCreature("Squidward"); 
		
		System.out.println(patrick.getName());
		System.out.println(squidward.getName());
		
		patrick.eat();
		patrick.laugh();
		
		squidward.eat();
		squidward.laugh();
		
		
		
		
	}

}
