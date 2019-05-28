package br.com.fatec.joilshow.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.fatec.joilshow.entidades.Produto;

public class DAOProdutoImpl implements DAOProduto {

	private Connection con;
	private static final String JDBC_URL = "jdbc:mariadb://localhost:9999/cadpro";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASS = "1015403";
	
	
	public DAOProdutoImpl() {
		
	
	try {
		Class.forName("org.mariadb.jdbc.Driver");		
		con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
		System.out.println("conectado");
		
		
	} catch (SQLException | ClassNotFoundException e) {
		e.printStackTrace();
		
	}
		
	
	}
	@Override
	public void adicionaProd(Produto produto){						
		try {
			PreparedStatement ps = con.prepareStatement(INSERIR_PRODUTO);
			ps.setInt(1, produto.getIdProduto());
			ps.setString(2,produto.getCodProduto());
			ps.setString(3, produto.getDescricao());
			ps.setInt(4, produto.getCodUnidade());
			ps.setInt(5, produto.getCodTipo());
			ps.setDouble(6, produto.getPrecoCusto());
			ps.setDouble(7, produto.getPrecoVenda());
			ps.setInt(8, produto.getQuantidade());
			
			ps.executeUpdate();
			ps.close();
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		
		 	
	}

	@Override
	public void excluirProd(Produto produto) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void alterarProd(Produto produto) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Produto> listaProduto(Produto produto) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getProduto(Produto produto) {
		// TODO Auto-generated method stub
		return null;
	}

}
