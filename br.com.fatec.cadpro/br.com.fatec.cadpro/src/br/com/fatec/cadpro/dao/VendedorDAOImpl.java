package br.com.fatec.cadpro.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.fatec.cadpro.entidades.Vendedor;

public class VendedorDAOImpl implements VendedorDAO{

	public void incluirVendedor(Vendedor vendedor) {
		try {
			
			PreparedStatement ps = con.prepareStatement(INSERIR_VENDEDOR);
			ps.setString(1,vendedor.getNome());
			ps.setString(2,vendedor.getEndereco());
			ps.setString(3,vendedor.getBairro());
			ps.setString(4,vendedor.getCidade());
			ps.setString(5,vendedor.getEstado());
			ps.setString(6,vendedor.getCep());
			ps.setString(7,vendedor.getCpf());
			ps.setString(8,vendedor.getRg());
			ps.setString(9,vendedor.getFone());
			ps.setString(10,vendedor.getEmail());
			ps.setDate(11, (Date) vendedor.getDataCad());
			ps.setDate(12,(Date) vendedor.getDataNasc());
			ps.setDouble(13,vendedor.getPorComissao());
			ps.executeUpdate();
			ps.close();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
	}

	public void atualizarVendedor(Vendedor vendedor) {
		try {
			
			PreparedStatement ps = con.prepareStatement(ALTERAR_VENDEDOR);
			ps.setInt(1, vendedor.getCodVen());
			ps.setString(2,vendedor.getNome());
			ps.setString(3,vendedor.getEndereco());
			ps.setString(4,vendedor.getBairro());
			ps.setString(5,vendedor.getCidade());
			ps.setString(6,vendedor.getEstado());
			ps.setString(7,vendedor.getCep());
			ps.setString(8,vendedor.getCpf());
			ps.setString(9,vendedor.getRg());
			ps.setString(10,vendedor.getFone());
			ps.setString(11,vendedor.getEmail());
			ps.setDate(12, (Date) vendedor.getDataCad());
			ps.setDate(13,(Date) vendedor.getDataNasc());
			ps.setDouble(14,vendedor.getPorComissao());
			ps.executeUpdate();
			ps.close();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		
	}

	public List<Vendedor> listarVendedor(Vendedor vendedor) {
		List<Vendedor> lv = new ArrayList<Vendedor>();
		try {
			
			PreparedStatement ps = con.prepareStatement(LISTAR_VENDEDOR);
			ps.setInt(1, vendedor.getCodVen());
			ps.setString(2,vendedor.getNome());
			ps.setString(3,vendedor.getEndereco());
			ps.setString(4,vendedor.getBairro());
			ps.setString(5,vendedor.getCidade());
			ps.setString(6,vendedor.getEstado());
			ps.setString(7,vendedor.getCep());
			ps.setString(8,vendedor.getCpf());
			ps.setString(9,vendedor.getRg());
			ps.setString(10,vendedor.getFone());
			ps.setString(11,vendedor.getEmail());
			ps.setDate(12, (Date) vendedor.getDataCad());
			ps.setDate(13,(Date) vendedor.getDataNasc());
			ps.setDouble(14,vendedor.getPorComissao());
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()){
				 Vendedor v = new Vendedor();
				 	v.setCodVen(rs.getInt("CODVEN"));
				 	v.setNome(rs.getString("NOME"));
				 	v.setEndereco(rs.getString("ENDERECO"));
				 	v.setBairro(rs.getString("BAIRRO"));
				 	v.setCidade(rs.getString("CIDADE"));
				 	v.setEstado(rs.getString("ESTADO"));
				 	v.setCep(rs.getString("CEP"));
				 	v.setCpf(rs.getString("CPF"));
				 	v.setRg(rs.getString("RG"));
				 	v.setFone(rs.getString("FONE"));
				 	v.setEmail(rs.getString("E_MAIL"));
				 	v.setDataCad(rs.getDate("DATA_CAD"));
				 	v.setDataNasc(rs.getDate("DATA_NASC"));
				 	v.setPorComissao(rs.getDouble("PORC_COMISSAO"));
				 	lv.add(v);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		return lv;
	}

	public Vendedor getVendedor(String codVendedor) {
		Vendedor v = new Vendedor();
		try {
			
			PreparedStatement ps = con.prepareStatement(getVendedor);
			ps.setString(1, codVendedor);
			
			ResultSet rs = ps.executeQuery();
			
				 	v.setCodVen(rs.getInt("CODVEN"));
				 	v.setNome(rs.getString("NOME"));
				 	v.setEndereco(rs.getString("ENDERECO"));
				 	v.setBairro(rs.getString("BAIRRO"));
				 	v.setCidade(rs.getString("CIDADE"));
				 	v.setEstado(rs.getString("ESTADO"));
				 	v.setCep(rs.getString("CEP"));
				 	v.setCpf(rs.getString("CPF"));
				 	v.setRg(rs.getString("RG"));
				 	v.setFone(rs.getString("FONE"));
				 	v.setEmail(rs.getString("E_MAIL"));
				 	v.setDataCad(rs.getDate("DATA_CAD"));
				 	v.setDataNasc(rs.getDate("DATA_NASC"));
				 	v.setPorComissao(rs.getDouble("PORC_COMISSAO"));
				 
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		return v;
	}

	/* ------------------- metodos Auxiliares  ---------------- */

	private Connection con;
	private static final String JDBC_URL = "jdbc:mariadb://localhost:9999/cadpro";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASS = "1015403";

	public VendedorDAOImpl() {
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

	public void excluirVendedor(Vendedor vendedor) {
try {
			
			PreparedStatement ps = con.prepareStatement(EXCLUIR_VENDEDOR);
			ps.setInt(1,vendedor.getCodVen());
			ps.executeUpdate();
			ps.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
