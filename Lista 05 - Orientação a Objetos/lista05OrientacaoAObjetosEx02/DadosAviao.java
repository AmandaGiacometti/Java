package lista05OrientacaoAObjetosEx02;

public class DadosAviao {
	
	private String modeloAviao;
	private String capacidadePassageiros;
	private String companhiaAerea;
	private String paisOrigem;
	
	public DadosAviao (String modelo,String capacidade,String companhia,String pais)
	{
		modeloAviao=modelo;
		capacidadePassageiros=capacidade;
		companhiaAerea=companhia;
		paisOrigem=pais;
	}
	
	public String getFichaAviao()
	{
		String FichaAviao="Modelo do avião: "+modeloAviao+"\nCapacidade de ocupação por passageiros: "+capacidadePassageiros+"\nCompanhia aérea responsável: "+companhiaAerea+"\nPaís de origem: "+paisOrigem;
		return FichaAviao;
	}

}
