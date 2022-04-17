package util;

public class Pessoa {
	public static String name = "Maria";
	public static int age = 18;
	
	public static void birthday(int years) {
		for ( int i=0; i<years; i++) {
		age += 1; 
		}
	}

}
