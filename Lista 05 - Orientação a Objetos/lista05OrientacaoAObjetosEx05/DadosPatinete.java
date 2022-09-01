package lista05OrientacaoAObjetosEx05;

public class DadosPatinete {
	
	public String marcaPatinete;
	public String modeloPatinete;
	public String corPatinete;
	public String rodaPatinete;
	
	public DadosPatinete(String marca, String modelo, String cor, String roda) 
	{
		marcaPatinete=marca;
		modeloPatinete=modelo;
		corPatinete=cor;
		rodaPatinete=roda;
	}

	public String getFichaPatinete()
	{
		String FichaPatinete="Marca: "+marcaPatinete+"\nModelo: "+modeloPatinete+"\nCor: "+corPatinete+"\nTipo de rodinha: "+rodaPatinete;
		return FichaPatinete;
	}

}
