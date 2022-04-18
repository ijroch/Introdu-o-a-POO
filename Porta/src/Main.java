import java.util.Scanner;
import entities.Porta;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Porta porta = new Porta();
		
		porta.abrePorta();
		porta.abrePorta();
		
		porta.cor = "amarelo";
		porta.pintaPorta();
		
		porta.cor = "azul";
		porta.pintaPorta();
		
		porta.cor = "branco";
		porta.pintaPorta();
		
		porta.altura= 2.00;
		porta.largura = 50;
		
		System.out.println("Novas dimensões da porta: " + porta.altura + " X " + porta.largura);
		
		porta.estaAberta();
		sc.close();
		;
		}
}