package util;

import java.util.Scanner;
import util.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos aniversários");
		int years = sc.nextInt();
		
		Pessoa.birthday(years);
		
		System.out.println(Pessoa.name + ", " + Pessoa.age + " anos." );
		
		sc.close();
		
		}
}

