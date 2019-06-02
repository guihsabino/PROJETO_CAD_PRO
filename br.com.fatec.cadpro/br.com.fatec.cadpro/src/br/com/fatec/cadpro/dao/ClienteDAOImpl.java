package br.com.fatec.cadpro.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fatec.cadpro.entidades.Cliente;

public class ClienteDAOImpl implements ClienteDAO {

	public void incluirCliente(Cliente cliente) {
			 
			
		try {
			PreparedStatement ps = con.prepareStatement(INSERIR_CLIENTE);
			ps.setString(1,cliente.getNome());
			ps.setString(2,cliente.getEndereco());
			ps.setString(3,cliente.getBairro());
			ps.setString(4,cliente.getCidade());
			ps.setString(5,cliente.getEstado());
			ps.setString(6,cliente.getCep());
			ps.setString(7,cliente.getCpfCnpj());
			ps.setString(8,cliente.getFone());
			ps.setString(9,cliente.getEmail());
			ps.setDate(10, (Date) cliente.getDataCad());
			ps.executeUpdate();
			ps.close();
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		
		 	
}
		
		


	public void excluirCliente(Cliente cliente) {
		
		try {
			PreparedStatement ps = con.prepareStatement(EXCLUIR_CLIENTE);
			ps.setInt(1, cliente.getCodCli()); 
			
			ps.executeUpdate();
			ps.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			e.printStackTrace();
		}

	}

	public void atualizarCliente(Cliente cliente) {
		
		try {
			PreparedStatement ps = con.prepareStatement(ALTERAR_CLIENTE);
			// parametro WHERE da query
			ps.setInt(1,cliente.getCodCli());
			// parametros para alteração do cliente. 
			ps.setString(2,cliente.getNome());
			ps.setString(3,cliente.getEndereco());
			ps.setString(4,cliente.getBairro());
			ps.setString(5,cliente.getCidade());
			ps.setString(6,cliente.getEstado());
			ps.setString(7,cliente.getCep());
			ps.setString(8,cliente.getCpfCnpj());
			ps.setString(9,cliente.getFone());
			ps.setString(10,cliente.getEmail());
		
			ps.executeUpdate();
			ps.close();
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 

	}

	public List<Cliente> listarClientes(Cliente cliente) {
		ArrayList<Cliente> listaDeCliente = new ArrayList<Cliente>();	
		try {
			PreparedStatement ps = con.prepareStatement(LISTAR_CLIENTE);
			ps.setString(1, cliente.getNome()); 
			ResultSet rs = ps.executeQuery();
		 while (rs.next()){
			 Cliente cli = new Cliente(); 
			 	cli.setCodCli(rs.getInt("CODCLI"));
			 	cli.setNome(rs.getString("NOME"));
			 	cli.setEndereco(rs.getString("ENDERECO"));
			 	cli.setBairro(rs.getString("BAIRRO"));
			 	cli.setCidade(rs.getString("CIDADE"));
			 	cli.setEstado(rs.getString("ESTADO"));
			 	cli.setCep(rs.getString("CEP"));
			 	cli.setCpfCnpj(rs.getString("CPFCNPJ"));
			 	cli.setFone(rs.getString("FONE"));
			 	cli.setEmail(rs.getString("EMAIL"));
			 	cli.setDataCad(rs.getDate("DATACAD"));
			 listaDeCliente.add(cli);
			 	
			 	
		 }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return listaDeCliente;
	}

	public Cliente getCliente(Cliente cliente) {
		try {
			PreparedStatement ps = con.prepareStatement(LISTAR_CLIENTE);
			ps.setInt(1, cliente.getCodCli()); 
			ResultSet rs = ps.executeQuery();
		 if (rs.next()){
			 Cliente cli = new Cliente(); 
			 	cli.setCodCli(rs.getInt("CODCLI"));
			 	cli.setNome(rs.getString("NOME"));
			 	cli.setEndereco(rs.getString("ENDERECO"));
			 	cli.setBairro(rs.getString("BAIRRO"));
			 	cli.setCidade(rs.getString("CIDADE"));
			 	cli.setEstado(rs.getString("ESTADO"));
			 	cli.setCep(rs.getString("CEP"));
			 	cli.setCpfCnpj(rs.getString("CPFCNPJ"));
			 	cli.setFone(rs.getString("FONE"));
			 	cli.setEmail(rs.getString("EMAIL"));
			 	cli.setDataCad(rs.getDate("DATACAD"));
			 
			 	return cli;
		 }	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return null;
			 	
	}

	/* ------------------- metodos Auxiliares  ---------------- */

	private Connection con;
	private static final String JDBC_URL = "jdbc:mariadb://localhost:9999/cadpro";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASS = "1015403";

	public ClienteDAOImpl() {
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
