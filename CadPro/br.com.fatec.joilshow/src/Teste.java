import br.com.fatec.joilshow.dao.DAOProduto;
import br.com.fatec.joilshow.dao.DAOProdutoImpl;
import br.com.fatec.joilshow.entidades.Produto;

public class Teste  {
	
	public static void main(String[] args) {
		
	try {
	
	DAOProduto dao = new DAOProdutoImpl();
	
	Produto p = new Produto(123, "17897", "rolo de madeira "
			,2, 1, 14.00, 12.00, 300);
	
	dao.adicionaProd(p);
	
	System.out.println("Adicionado!!! ");
	
	} catch (Throwable e) {
		e.printStackTrace();
	}
	
}
	
}	
	
	
	

