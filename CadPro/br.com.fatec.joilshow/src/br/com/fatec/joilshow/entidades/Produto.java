package br.com.fatec.joilshow.entidades;

public class Produto {

	public int idProduto;
	public String codProduto;
	public String descricao;
	public int codUnidade;
	public int codTipo;
	public double precoCusto;
	public double precoVenda;
	public int quantidade;
	
	
	
	
	
	public Produto(int idProduto, String codProduto, String descricao, int codUnidade, int codTipo, double precoCusto,
			double precoVenda, int quantidade) {
		super();
		this.idProduto = idProduto;
		this.codProduto = codProduto;
		this.descricao = descricao;
		this.codUnidade = codUnidade;
		this.codTipo = codTipo;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.quantidade = quantidade;
	}
	
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCodUnidade() {
		return codUnidade;
	}
	public void setCodUnidade(int codUnidade) {
		this.codUnidade = codUnidade;
	}
	public int getCodTipo() {
		return codTipo;
	}
	public void setCodTipo(int codTipo) {
		this.codTipo = codTipo;
	}
	public double getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	public double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

		


}
