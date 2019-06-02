package br.com.fatec.cadpro.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fatec.cadpro.entidades.Produto;

public class ProdutoDAOImpl implements ProdutoDAO {
	

	public void incluirProduto(Produto produto) {
		try {
			PreparedStatement ps = con.prepareStatement(INSERIR_PRODUTO);
			ps.setString(1,produto.getCodProduto());
			ps.setString(2,produto.getDescricao());
			ps.setInt(3, produto.getCodUnidade());
			ps.setInt(4, produto.getCodTipo());
			ps.setDouble(5, produto.getPrecoCusto());
			ps.setDouble(6,produto.getPrecoVenda());
			ps.setInt(6,produto.getQuantidade());
			ps.executeUpdate();
			ps.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void excluirProduto(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	public void atualizarProduto(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	public List<Produto> listarProdutos(Produto produto) {
		ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
		
		try {
			PreparedStatement ps = con.prepareStatement(LISTAR_PRODUTO);
			ps.setString(1,produto.getDescricao());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Produto p = new Produto();
					p.setIdProduto(rs.getInt("IDPRODUTO"));
					p.setCodProduto(rs.getString("CODPRODUTO"));
					p.setDescricao(rs.getString("DESCRICAO"));
					p.setCodUnidade(rs.getInt("CODUNIDADE"));
					p.setCodTipo(rs.getInt("CODTIPO"));
					p.setPrecoCusto(rs.getDouble("PRECOCUSTO"));
					p.setPrecoVenda(rs.getDouble("PRECOVENDA"));
					p.setQuantidade(rs.getInt("QUANTIDADE"));
					listaDeProdutos.add(p);
				
			}
			
			return listaDeProdutos;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null; 
	}
	
	public Produto getProduto(Produto produto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/* METODOS PRIVADOS */
	
	private Connection con;
	private static final String JDBC_URL = "jdbc:mariadb://localhost:9999/cadpro";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASS = "1015403";

	public ProdutoDAOImpl() {
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
