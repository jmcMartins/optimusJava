package iftm.poo.lista4;

public class ItemOrcamentoComplexo extends ItemOrcamento{
	private int quant;
	public ItemOrcamentoComplexo(){
		
	}
	public ItemOrcamentoComplexo(String historico, float valor, int quant){
		super(historico,valor);
		this.quant = quant;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
}
