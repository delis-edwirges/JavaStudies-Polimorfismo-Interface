package br.com.generation.interfaces;
public class ImprimirAnimais {
	public static void main(String[] args) {
		Cachorro catiorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Pregui�a preguica = new Pregui�a();

		
		catiorro.som();
		cavalo.som();
		preguica.som();
		System.out.println();
		catiorro.corre();
		cavalo.corre();
		preguica.sobe();
		
		
	
	}
}
