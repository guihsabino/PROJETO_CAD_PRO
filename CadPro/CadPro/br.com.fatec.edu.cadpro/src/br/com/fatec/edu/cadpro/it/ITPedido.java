package br.com.fatec.edu.cadpro.it;

import java.util.Date;

public interface ITPedido {

		public int getCodCli();
		public int getCodVen();
		public Date getDataEmissao();
		public double getVlrTotal();
		public String getSituacao();
		public String getObservacao();
		
	
}