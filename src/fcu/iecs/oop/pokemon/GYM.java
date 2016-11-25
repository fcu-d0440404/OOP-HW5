package fcu.iecs.oop.pokemon;

import java.util.Random;

public class GYM {

	
	public static void fight(Pokemon p1, Pokemon p2) {

		Random ran = new Random();
		
		int a=ran.nextInt(2);

		if(a==1)
		{
			System.out.printf("Winner is %s",p1.getName());
			p1.setCp(p1.getCp()+500);
			
			
		}
		else
		{
			System.out.printf("Winner is %s",p2.getName());
			
			p2.setCp(p2.getCp()+500);
		}
		
		
		
		
		}

	
	
}
