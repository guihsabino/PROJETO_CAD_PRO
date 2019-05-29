package br.com.fatec.cadpro.dao;

import java.util.List;

import br.com.fatec.cadpro.entidades.Produto;

public interface ProdutoDAO {
		
	public static final String INSERIR_PRODUTO =" INSERT INTO TB_PRODUTO ( CODPRODUTO, DESCRICAO , CODUNIDADE , "
			+ "CODTIPO , PRECOCUSTO , PRECOVENDA , QUANTIDADE) VALUES ( ? ,? ,? ,? ,? ,? ,? );  ";
	public static final String LISTAR_PRODUTO = "SELECT * FROM TB_PRODUTO WHERE DESCRICAO LIKE ? ;";
	
	public void incluirProduto(Produto produto);
	public void excluirProduto(Produto produto);
	public void atualizarProduto(Produto produto);
	public List<Produto> listarProdutos(Produto produto);
	public Produto getProduto(Produto produto);
	
	
}
