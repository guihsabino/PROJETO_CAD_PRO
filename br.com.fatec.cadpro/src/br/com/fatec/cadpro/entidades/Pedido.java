package br.com.fatec.cadpro.entidades;

import java.util.Date;

public class Pedido {
 
	public int getCodCli;
	public int getCodVen;
	public Date getDataEmissao;
	public double getVlrTotal;
	public String getSituacao;
	public String getObservacao;
	
	public Pedido(int getCodCli, int getCodVen, Date getDataEmissao, double getVlrTotal, String getSituacao,
			String getObservacao) {
		super();
		this.getCodCli = getCodCli;
		this.getCodVen = getCodVen;
		this.getDataEmissao = getDataEmissao;
		this.getVlrTotal = getVlrTotal;
		this.getSituacao = getSituacao;
		this.getObservacao = getObservacao;
	}
	public Pedido(int getCodCli) {
		super();
		this.getCodCli = getCodCli;
	}
	public int getGetCodCli() {
		return getCodCli;
	}
	public void setGetCodCli(int getCodCli) {
		this.getCodCli = getCodCli;
	}
	public int getGetCodVen() {
		return getCodVen;
	}
	public void setGetCodVen(int getCodVen) {
		this.getCodVen = getCodVen;
	}
	public Date getGetDataEmissao() {
		return getDataEmissao;
	}
	public void setGetDataEmissao(Date getDataEmissao) {
		this.getDataEmissao = getDataEmissao;
	}
	public double getGetVlrTotal() {
		return getVlrTotal;
	}
	public void setGetVlrTotal(double getVlrTotal) {
		this.getVlrTotal = getVlrTotal;
	}
	public String getGetSituacao() {
		return getSituacao;
	}
	public void setGetSituacao(String getSituacao) {
		this.getSituacao = getSituacao;
	}
	public String getGetObservacao() {
		return getObservacao;
	}
	public void setGetObservacao(String getObservacao) {
		this.getObservacao = getObservacao;
	}
	
	
}
