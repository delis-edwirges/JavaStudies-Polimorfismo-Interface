package br.com.generation.interfaces;
public class ImprimirAnimais {
	public static void main(String[] args) {
		Cachorro catiorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguiça preguica = new Preguiça();

		
		catiorro.som();
		cavalo.som();
		preguica.som();
		System.out.println();
		catiorro.corre();
		cavalo.corre();
		preguica.sobe();
		
		
	
	}
}
