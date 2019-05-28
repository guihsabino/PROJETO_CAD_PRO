package br.com.fatec.joilshow.dao;

import java.util.List;

import br.com.fatec.joilshow.entidades.Produto;

public interface DAOProduto {

			public static final String INSERIR_PRODUTO ="INSERT INTO tb_PRODUTO ( IDPRODUTO, CODPRODUTO , DESCRICAO , CODUNIDADE , CODTIPO , PRECOCUSTO , PRECOVENDA , QUANTIDADE) "
				+ "VALUES (  ? , ? , ? , ? , ? , ? , ? , ? ); ";
			public static final String EXCLUIR_PRODUTO = " DELETE FROM TB_PRODUTO WHERE IDPRODUTO = ? ;";
			
			public void adicionaProd(Produto produto);
			public void excluirProd(Produto produto);
			public void alterarProd(Produto produto);
			public List<Produto> listaProduto(Produto produto);
			public String getProduto(Produto produto);
			
			
}
