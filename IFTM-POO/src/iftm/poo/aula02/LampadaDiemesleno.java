package iftm.poo.aula02;

public class LampadaDiemesleno {
	private boolean status = false;
	private String marca, cor;
	private int voltagem, frequencia;
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	public int getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}
	
	public void acende(boolean acao){
		this.setStatus(acao);
		if(acao)
			System.out.println("Foi acessa...");
		else
			System.out.println("Foi apagada...");
	}
	
}
