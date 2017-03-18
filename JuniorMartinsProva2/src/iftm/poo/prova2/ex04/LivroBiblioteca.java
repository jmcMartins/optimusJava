package iftm.poo.prova2.ex04;

public class LivroBiblioteca extends Livro implements ItemBiblioteca  {
	
	private boolean statusEmprestimo;
	private String localizacao;
	private String descricao;
	
	public LivroBiblioteca(){
		
	}
	public LivroBiblioteca(String titulo, String autor, int n, int a){
		super(titulo,autor,n,a);
		
	}
	
	
	@Override
	public String localiza() {
		return this.getLocalizacao();
	}
	
	@Override
	public boolean isEmprestado() {
		return this.isEmprestado();
	}

	@Override
	public void empresta() {
		this.setStatusEmprestimo(false);
	}

	@Override
	public void devolve() {
		this.setStatusEmprestimo(true);
	}

	@Override
	public String apresentaDescricao() {
		return this.getDescricao();
	}
	
	public boolean isStatusEmprestimo() {
		return statusEmprestimo;
	}

	public void setStatusEmprestimo(boolean statusEmprestimo) {
		this.statusEmprestimo = statusEmprestimo;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		
		return "Titulo: "+this.getTitulo()+"\nAutor: "+this.getAutor()+"\nNº Paginas: "+this.getNumeroPaginas()+"\nAno Edição: "+this.getAnoEdicao()+"Status Emprestimo: "+this.isStatusEmprestimo();
	}

}
