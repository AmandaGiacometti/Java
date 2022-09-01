package lista05OrientacaoAObjetosEx06;

public class CaracteristicasContaBancaria {

	private String qualBanco;
	private String tipoConta;
	private String nomeUsuario;
	private String numeroConta;
	
	public CaracteristicasContaBancaria (String banco,String conta,String nome,String numero)
	{
		qualBanco=banco;
		tipoConta=conta;
		nomeUsuario=nome;
		numeroConta=numero;
	}
	
	public String getDadosConta()
	{
		String DadosConta="Banco: "+qualBanco+"\nTipo de conta: "+tipoConta+"\nNome do proprietátio da conta: "+nomeUsuario+"\nNúmero da conta: "+numeroConta;
		return DadosConta;
	}
}
