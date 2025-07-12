package _03_tea_maker;

import _03_tea_maker.Kettle.Water;

public class TeaMakerRunner {
	public static void main(String [] args) {
		
		TeaBag tbag = new TeaBag("Chamomile");
		Kettle kettle = new Kettle(); 
		Cup cup = new Cup();
		
		kettle.getWater(); 
		kettle.boil(); 
				
		
		cup.makeTea(tbag, Kettle.Water hotWater);
		
	}
}
