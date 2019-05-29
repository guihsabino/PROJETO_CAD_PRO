package br.com.fatec.cadpro.dao;

import java.util.List;

import br.com.fatec.cadpro.entidades.Pedido;

public interface PedidoDAO {
	
	public static final String INSERIR_PEDIDO=" INSERT INTO TB_PEDIDO (	CODCLI , CODVEN , DATAEMISSAO , VLRTOTAL , SITUACAO , OBSERVACAO )"
			+ "VALUES ( ? , ? , ? , ? , ? , ? ); ";
	public static final String LISTAR_PEDIDO =" SELECT * FROM TB_PEDIDO WHERE CODVEN = ? "; 

		public void incluirPedido(Pedido pedido);
		public void excluirPedido(Pedido pedido);
		public void atualizarPedido(Pedido pedido);
		public List<Pedido> listarPedidos(Pedido pedido);
		public Pedido getPedido(Pedido pedido);
		
	
}
