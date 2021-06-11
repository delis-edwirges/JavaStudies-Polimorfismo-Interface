package br.com.generation.interfaces;

public class Cachorro extends Animal implements InterfaceAnimais {
	
	public void som() {
	System.out.println("Som do cachorro: Auauau");
	}
	
	public void corre() {
	System.out.println("O cachorro est� correndo em sua dire��o...");
	}
	
	
	private String porte;
	private String raca;
	private String cor;
	private String pelagem;
	private String dono;
	
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPelagem() {
		return pelagem;
	}
	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
}
	