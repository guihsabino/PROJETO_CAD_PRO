package br.com.fatec.edu.cadpro.ac;

public abstract class ACProduto {

	protected int	idProduto;
	protected String	codProduto;
	protected String 	descricao;
	protected int codUnidade;
	protected int codTipo;
	protected double precoCusto;
	protected double precoVenda;
	protected int qtdEstimada;
	protected int qtdReal;
	protected int qtdMinima;
	protected String clasFisc;
	protected int ipi;
	protected double pesoLiq;
	
	
	public ACProduto(int idProduto) {
		super();
		this.idProduto = idProduto;
	}


	public ACProduto(int idProduto, String codProduto, String descricao,
			int codUnidade, int codTipo, double precoCusto, double precoVenda,
			int qtdEstimada, int qtdReal, int qtdMinima, String clasFisc,
			int ipi, double pesoLiq) {
		super();
		this.idProduto = idProduto;
		this.codProduto = codProduto;
		this.descricao = descricao;
		this.codUnidade = codUnidade;
		this.codTipo = codTipo;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.qtdEstimada = qtdEstimada;
		this.qtdReal = qtdReal;
		this.qtdMinima = qtdMinima;
		this.clasFisc = clasFisc;
		this.ipi = ipi;
		this.pesoLiq = pesoLiq;
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


	public int getQtdEstimada() {
		return qtdEstimada;
	}


	public void setQtdEstimada(int qtdEstimada) {
		this.qtdEstimada = qtdEstimada;
	}


	public int getQtdReal() {
		return qtdReal;
	}


	public void setQtdReal(int qtdReal) {
		this.qtdReal = qtdReal;
	}


	public int getQtdMinima() {
		return qtdMinima;
	}


	public void setQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}


	public String getClasFisc() {
		return clasFisc;
	}


	public void setClasFisc(String clasFisc) {
		this.clasFisc = clasFisc;
	}


	public int getIpi() {
		return ipi;
	}


	public void setIpi(int ipi) {
		this.ipi = ipi;
	}


	public double getPesoLiq() {
		return pesoLiq;
	}


	public void setPesoLiq(double pesoLiq) {
		this.pesoLiq = pesoLiq;
	}

		
	
		
		 
}
