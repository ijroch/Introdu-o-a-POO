package entities;

public class Porta {
	public String cor; 
	public double altura = 1.98;
	public double largura = 50;
	int aberta = 0; 
	
	public void abrePorta() {
		if (aberta==0) {
		this.aberta = 1;
		System.out.println("Abriu a porta.");
		} else {
			this.aberta = 0; 
			System.out.println("Fechou a porta.");	
		}
	}
	
	public void pintaPorta() {
		System.out.println("Porta pintada de "+ this.cor);
	}
	
	public void estaAberta() {
		if (aberta==0) {
			this.aberta = 1;
			System.out.println("A porta está Fechada. ");
		} else {
			this.aberta = 0; 
			System.out.println("A porta está Aberta. ");
		}		
		
	}
}
