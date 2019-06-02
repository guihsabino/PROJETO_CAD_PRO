package br.com.fatec.cadpro.dao;

import java.util.List;
import br.com.fatec.cadpro.entidades.Vendedor;

public interface VendedorDAO {
	public static final String INSERIR_VENDEDOR = " INSERT INTO TB_VENDEDOR ( NOME , ENDERECO , BAIRRO , CIDADE ," +
			" ESTADO , CEP , CPF , RG , FONE, E_MAIL , DATA_CAD , DATA_NASC , PORC_COMISSAO ) VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ?"
			+ " , ? , ? , ? ); ";
	
	public static final String EXCLUIR_VENDEDOR = " DELETE FROM TB_VENDEDOR WHERE CODVEN = ? ;";
	
	public static final String ALTERAR_VENDEDOR = " UPDATE TB_VENDEDOR WHERE CODVEN = ?  " +
			"SET  NOME  = ? , " +
			"	  ENDERECO = ? , " +
			"	  BAIRRO = ? , " +
			"	  CIDADE = ? , " +
			"     ESTADO = ? , " +
			"	  CEP = ? , " +
			"	  CPF = ? , " +
			"     RG = ? , " +
			"     FONE = ? , " +
			"     E_MAIL = ? , " +
			"     DATA_CAD = ? , " +
			"     DATA_NASC = ? , " +
			"     PORC_COMISSAO = ? );";	 
	
	public static final String  LISTAR_VENDEDOR = "SELECT  CODVEN , NOME , ENDERECO , BAIRRO , CIDADE , ESTADO , CEP , CPF , RG , FONE, E_MAIL ,"
			+ "										 DATA_CAD , DATA_NASC , PORC_COMISSAO FROM TB_VENDEDOR"
			+ "					WHERE CODVEN = ?  AND NOME LIKE ?% AND ENDERECO LIKE ?% AND BAIRRO LIKE ?% AND CIDADE LIKE ?% AND ESTADO LIKE ?%"
			+ "					AND CEP LIKE ?% AND CPF LIKE ?% AND RG LIKE ?% AND FONE LIKE ?% AND E_MAIL LIKE ?% AND DATA_CAD LIKE ?% AND DATA_NASC LIKE ?%"
			+ "					AND PORC_COMISSAO LIKE ?%;";
	
	public static final String  getVendedor = " CODFORNECEDOR , NOME , CNPJ , ENDERECO , CEP , BAIRRO , CIDADE , "
			+ "									ESTADO , FONE , EMAIL FROM TB_FORNECEDOR WHERE CODFORNECEDOR = ? ;"; 
	
	
	public void incluirVendedor(Vendedor vendedor);
	public void atualizarVendedor(Vendedor vendedor);
	public void excluirVendedor(Vendedor vendedor);
	public List<Vendedor> listarVendedor(Vendedor vendedor);
	public Vendedor getVendedor(String codVendedor);
}
