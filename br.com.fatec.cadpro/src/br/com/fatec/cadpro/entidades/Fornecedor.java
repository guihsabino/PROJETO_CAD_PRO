package br.com.fatec.cadpro.entidades;

public class Fornecedor {
	public int codFornecedor;
	public String nome;
	public String cnpj;
	public String endereco; 
	public String cep; 
	public String bairro;
	public String cidade;
	public String estado;
	public String fone;
	public String email;

	public Fornecedor(int codFornecedor) {
		super();
		this.codFornecedor = codFornecedor;
	}

	public Fornecedor(int codFornecedor, String nome, String cnpj, String endereco, String cep, String bairro,
			String cidade, String estado, String fone, String email) {
		super();
		this.codFornecedor = codFornecedor;
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.fone = fone;
		this.email = email;
	}

	public int getCodFornecedor() {
		return codFornecedor;
	}

	public void setCodFornecedor(int codFornecedor) {
		this.codFornecedor = codFornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
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
	
}
