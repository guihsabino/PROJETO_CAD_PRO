package br.com.fatec.cadpro.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fatec.cadpro.entidades.Fornecedor;

public class FornecedorDAOImpl implements FornecedorDAO{

	public void incluirFornecedor(Fornecedor fornecedor) {
		
		try {
			
			PreparedStatement ps = con.prepareStatement(INSERIR_FORNECEDOR);
			ps.setString(1,fornecedor.getNome());
			ps.setString(2,fornecedor.getCnpj());
			ps.setString(3,fornecedor.getEndereco());
			ps.setString(4,fornecedor.getCep());
			ps.setString(5,fornecedor.getBairro());
			ps.setString(6,fornecedor.getCidade());
			ps.setString(7,fornecedor.getEstado());
			ps.setString(8,fornecedor.getFone());
			ps.setString(9,fornecedor.getEmail());
			ps.executeUpdate();
			ps.close();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		
	}

	public void excluirFornecedor(Fornecedor fornecedor) {
		try {
			
			PreparedStatement ps = con.prepareStatement(EXCLUIR_FORNECEDOR);
			ps.setInt(1,fornecedor.getCodFornecedor());
			ps.executeUpdate();
			ps.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
	}

	public void atualizarFornecedor(Fornecedor fornecedor) {
		
		try {
			
			PreparedStatement ps = con.prepareStatement(ALTERAR_FORNECEDOR);
			ps.setInt(1,fornecedor.getCodFornecedor());
			ps.setString(2,fornecedor.getNome());
			ps.setString(3,fornecedor.getCnpj());
			ps.setString(4,fornecedor.getEndereco());
			ps.setString(5,fornecedor.getCep());
			ps.setString(6,fornecedor.getBairro());
			ps.setString(7,fornecedor.getCidade());
			ps.setString(8,fornecedor.getEstado());
			ps.setString(9,fornecedor.getFone());
			ps.setString(10,fornecedor.getEmail());
			ps.executeUpdate();
			ps.close();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		
	}

	public List<Fornecedor> listarFornecedor(Fornecedor fornecedor) {
		List<Fornecedor> lf = new ArrayList<Fornecedor>();
		try {
			
			PreparedStatement ps = con.prepareStatement(LISTAR_FORNECEDOR);
			ps.setInt(1,fornecedor.getCodFornecedor());
			ps.setString(2,fornecedor.getNome());
			ps.setString(3,fornecedor.getCnpj());
			ps.setString(4,fornecedor.getEndereco());
			ps.setString(5,fornecedor.getCep());
			ps.setString(6,fornecedor.getBairro());
			ps.setString(7,fornecedor.getCidade());
			ps.setString(8,fornecedor.getEstado());
			ps.setString(9,fornecedor.getFone());
			ps.setString(10,fornecedor.getEmail());
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()){
				 Fornecedor f = new Fornecedor();
				 	f.setCodFornecedor(rs.getInt("CODFORNECEDOR"));
				 	f.setNome(rs.getString("NOME"));
				 	f.setCnpj(rs.getString("CNPJ"));
				 	f.setEndereco(rs.getString("ENDERECO"));
				 	f.setBairro(rs.getString("BAIRRO"));
				 	f.setCidade(rs.getString("CIDADE"));
				 	f.setEmail(rs.getString("EMAIL"));
				 	f.setFone(rs.getString("FONE"));
				 	f.setCep(rs.getString("CEP"));
				 	f.setEstado(rs.getString("ESTADO"));
				 	lf.add(f);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		return lf;
	}

	public Fornecedor getFornecedor(String codFornecedor) {
		Fornecedor f = new Fornecedor();
		try {
			
			PreparedStatement ps = con.prepareStatement(getFornecedor);
			ps.setString(1,codFornecedor);
			ResultSet rs = ps.executeQuery();
			
				 	f.setCodFornecedor(rs.getInt("CODFORNECEDOR"));
				 	f.setNome(rs.getString("NOME"));
				 	f.setCnpj(rs.getString("CNPJ"));
				 	f.setEndereco(rs.getString("ENDERECO"));
				 	f.setBairro(rs.getString("BAIRRO"));
				 	f.setCidade(rs.getString("CIDADE"));
				 	f.setEmail(rs.getString("EMAIL"));
				 	f.setFone(rs.getString("FONE"));
				 	f.setCep(rs.getString("CEP"));
				 	f.setEstado(rs.getString("ESTADO"));
				 	
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		return f;
	}
	
	/* ------------------- metodos Auxiliares  ---------------- */

	private Connection con;
	private static final String JDBC_URL = "jdbc:mariadb://localhost:9999/cadpro";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASS = "1015403";

	public FornecedorDAOImpl() {
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
