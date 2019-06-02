package br.com.fatec.cadpro.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fatec.cadpro.entidades.Pedido;

public class PedidoDAOImpl implements PedidoDAO {

	public void incluirPedido(Pedido pedido)  {
		
			try {
				PreparedStatement ps = con.prepareStatement(INSERIR_PEDIDO);
				ps.setInt(1,pedido.getCodCli());
				ps.setInt(2,pedido.getCodVen());
				ps.setDate(3,(Date) pedido.getDataEmissao());
				ps.setDouble(4, pedido.getVlrTotal());
				ps.setString(5, pedido.getSituacao());
				ps.setString(6,pedido.getObservacao());
				ps.executeUpdate();
				ps.close();
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			
	}

	public void excluirPedido(Pedido pedido) {
		// TODO Auto-generated method stub
		
	}

	public void atualizarPedido(Pedido pedido) {
		// TODO Auto-generated method stub
		
	}

	public List<Pedido> listarPedidos(Pedido pedido) {
		ArrayList<Pedido> listaDePedidos = new ArrayList<Pedido>();
		
		try {
			PreparedStatement ps = con.prepareStatement(LISTAR_PEDIDO);
			ps.setInt(1,pedido.getCodVen());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Pedido p = new Pedido();
					p.setCodCli(rs.getInt("CODCLI"));
					p.setCodVen(rs.getInt("CODVEN"));
					p.setDataEmissao(rs.getDate("DATAEMISSAO"));
					p.setObservacao(rs.getString("OBSERVACAO"));
					p.setSituacao(rs.getString("SITUACAO"));
					p.setVlrTotal(rs.getDouble("VLRTOTAL"));
					listaDePedidos.add(p);
				
			}
			
			return listaDePedidos;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}

	public Pedido getPedido(Pedido pedido) {
		// TODO Auto-generated method stub
		return null;
	}

	/* --------------------- METODOS AUXILIARES ----------------------------*/
	private Connection con;
	private static final String JDBC_URL = "jdbc:mariadb://localhost:9999/cadpro";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASS = "1015403";

	public PedidoDAOImpl() {
		boolean conectado = false; 
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
			conectado = true; 
		} catch (Throwable e) {
			e.printStackTrace();

		}	finally {
			if(conectado){
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
	}
	
	
	
}
