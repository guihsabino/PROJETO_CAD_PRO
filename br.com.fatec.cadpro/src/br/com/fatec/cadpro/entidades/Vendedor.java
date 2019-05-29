package br.com.fatec.cadpro.entidades;

import java.util.Date;

public class Vendedor {

	public int codVen;
	public String nome;
	public String endereco;
	public String bairro;
	public String cidade;
	public String estado;
	public String cep;
	public String cpf;
	public String rg;
	public String fone;
	public String email;
	public Date dataCad;
	public Date dataNasc;
	public double porComissao;
	
	
	public Vendedor(int codVen) {
		super();
		this.codVen = codVen;
	}


	public Vendedor(int codVen, String nome, String endereco, String bairro, String cidade, String estado, String cep,
			String cpf, String rg, String fone, String email, Date dataCad, Date dataNasc, double porComissao) {
		super();
		this.codVen = codVen;
		this.nome = nome;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.cpf = cpf;
		this.rg = rg;
		this.fone = fone;
		this.email = email;
		this.dataCad = dataCad;
		this.dataNasc = dataNasc;
		this.porComissao = porComissao;
	}


	public int getCodVen() {
		return codVen;
	}


	public void setCodVen(int codVen) {
		this.codVen = codVen;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getFone() {
		return fone;
	}


	public void setFone(String fone) {
		this.fone = fone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getDataCad() {
		return dataCad;
	}


	public void setDataCad(Date dataCad) {
		this.dataCad = dataCad;
	}


	public Date getDataNasc() {
		return dataNasc;
	}


	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}


	public double getPorComissao() {
		return porComissao;
	}


	public void setPorComissao(double porComissao) {
		this.porComissao = porComissao;
	}
	
	
	
	
	

	
}
