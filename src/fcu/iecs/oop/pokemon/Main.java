package fcu.iecs.oop.pokemon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		String a,c;
		int b,d;
		
	
		System.out.printf("input pokemon p1 name and cp:");
		a=scanner.next();
		b=scanner.nextInt();
	
		System.out.printf("input pokemon p2 name and cp:");
		c=scanner.next();
		d=scanner.nextInt();
		Pokemon p1 = new Pokemon(a,b);
		Pokemon p2 = new Pokemon(c,d);
		GYM.fight(p1, p2);
	
		scanner.close();
		}

}
