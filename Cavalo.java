package br.com.generation.interfaces;

public class Cavalo extends Animal implements InterfaceAnimais {
	
	public void som() {
		System.out.println("Irrinhi�, disse o cavalo.");
	} 
	public void corre() {
		System.out.println("O Cavalo est� correndo: Pocot�.. Pocot�");
	}
	
	private String tipo; // corrida ou domestico
	private String raca;
	private String cor;
	private String pelagem;
	private String dono;
	private String velocidade;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	public String getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(String velocidade) {
		this.velocidade = velocidade;
	}
	@Override
	public void sobe() {
		// TODO Auto-generated method stub
		
	}
	
	
}
