package lista05OrientacaoAObjetosEx01;

public class DadosCliente {
	
	private String nomeCliente;
	private String cpfCliente;
	private String idadeCliente;
	
	public DadosCliente (String nome,String cpf,String idade)
	{
		nomeCliente=nome;
		cpfCliente=cpf;
		idadeCliente=idade;		
	}

	public String getFichaCliente()
	{
		String FichaCliente="Nome: "+nomeCliente+"; CPF: "+cpfCliente+"; Idade: "+idadeCliente+";";
		return FichaCliente;
	}
}
