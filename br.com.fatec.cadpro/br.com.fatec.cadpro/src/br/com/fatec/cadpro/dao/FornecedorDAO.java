package br.com.fatec.cadpro.dao;

import java.util.List;

import br.com.fatec.cadpro.entidades.Fornecedor;

public interface FornecedorDAO {
	
	public static final String INSERIR_FORNECEDOR = " INSERT INTO TB_FORNECEDOR ( NOME , CNPJ , ENDERECO , CEP ," +
			" BAIRRO , CIDADE , ESTADO , FONE , EMAIL ) VALUES ( ? , ? , ? ,? ,? ,? ,? ,? ,? ); ";
	public static final String EXCLUIR_FORNECEDOR = " DELETE FROM TB_FORNECEDOR WHERE CODFORNECEDOR = ? ;";
	public static final String ALTERAR_FORNECEDOR = " UPDATE TB_FORNECEDOR WHERE CODFORNECEDOR = ?  " +
			"SET  NOME  = ? , " +
			"	  CNPJ = ? , " +
			"	  ENDERECO = ? , " +
			"	  CEP = ? , " +
			"     BAIRRO = ? , " +
			"	  CIDADE = ? , " +
			"	  ESTADO = ? , " +
			"     FONE = ? , " +
			"     EMAIL = ? );";	 
	public static final String  LISTAR_FORNECEDOR = "SELECT  CODFORNECEDOR , NOME , CNPJ , ENDERECO , CEP , BAIRRO , CIDADE ,"
			+ "									  ESTADO , FONE , EMAIL FROM TB_FORNECEDOR WHERE CODFORNECEDOR LIKE ?% AND NOME LIKE ?% AND"
			+ "									  CNPJ LIKE ?% AND ENDERECO LIKE ?% AND CEP LIKE ?% AND BAIRRO LIKE ?% AND CIDADE LIKE ?% AND"
			+ "									  ESTADO LIKE ?% AND FONE LIKE ?% AND EMAIL LIKE ?%";
	
	public static final String  getFornecedor = " CODFORNECEDOR , NOME , CNPJ , ENDERECO , CEP , BAIRRO , CIDADE , "
			+ "									ESTADO , FONE , EMAIL FROM TB_FORNECEDOR WHERE CODFORNECEDOR = ? ;"; 
	
	
	public void incluirFornecedor(Fornecedor fornecedor);
	public void excluirFornecedor(Fornecedor fornecedor);
	public void atualizarFornecedor(Fornecedor fornecedor);
	public List<Fornecedor> listarFornecedor(Fornecedor fornecedor);
	public Fornecedor getFornecedor(String codFornecedor);
}
