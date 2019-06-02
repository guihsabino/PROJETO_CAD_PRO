package br.com.fatec.cadpro.entidades;

import java.util.Date;

public class Cliente {

	public int codCli;
	public String nome;
	public String endereco;
	public String bairro;
	public String cidade;
	public String estado;
	public String cep;
	public String cpfCnpj;
	public String fone;
	public String email;
	public Date dataCad;
	
	
	public Cliente(int codCli) {
		super();
		this.codCli = codCli;
	}


	public Cliente(int codCli, String nome, String endereco, String bairro, String cidade, String estado, String cep,
			String cpfCnpj, String fone, String email, Date dataCad) {
		super();
		this.codCli = codCli;
		this.nome = nome;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.cpfCnpj = cpfCnpj;
		this.fone = fone;
		this.email = email;
		this.dataCad = dataCad;
	}


	public int getCodCli() {
		return codCli;
	}


	public void setCodCli(int codCli) {
		this.codCli = codCli;
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


	public String getCpfCnpj() {
		return cpfCnpj;
	}


	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
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
	
	
	
	

}
