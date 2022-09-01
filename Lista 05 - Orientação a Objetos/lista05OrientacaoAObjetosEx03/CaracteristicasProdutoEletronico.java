package lista05OrientacaoAObjetosEx03;

public class CaracteristicasProdutoEletronico {
	
	private String tipoProduto;
	private String marcaProduto;
	private String categoriaProduto;
	
	public CaracteristicasProdutoEletronico (String tipo,String marca,String categoria)
	{
		tipoProduto=tipo;
		marcaProduto=marca;
		categoriaProduto=categoria;
	}
	
	public String getFichaProduto()
	{
		String FichaProduto="Tipo de produto: "+tipoProduto+"\nMarca: "+marcaProduto+"\nCategoria: "+categoriaProduto;
		return FichaProduto;
	}
}
