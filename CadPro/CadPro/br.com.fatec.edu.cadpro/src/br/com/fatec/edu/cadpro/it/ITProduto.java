package br.com.fatec.edu.cadpro.it;



public interface ITProduto extends ITProdutoPK {

	
	public String	getCodProduto();
	public String 	getDescricao();
	public int getCodUnidade();
	public int getCodTipo();
	public double getPrecoCusto();
	public double getPrecoVenda();
	public int getQuantidade();


	
}
