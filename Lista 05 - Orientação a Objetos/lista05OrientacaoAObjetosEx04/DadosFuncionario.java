package lista05OrientacaoAObjetosEx04;

public class DadosFuncionario {

	private String nomeFun;
	private String registroFun;
	private String anoAdmissao;
	private String salarioFun;
	
	public DadosFuncionario (String nome,String registro,String admissao,String salario)
	{
		nomeFun=nome;
		registroFun=registro;
		anoAdmissao=admissao;
		salarioFun=salario;		
	}
	
	public String getCadastroFuncionario()
	{
		String CadastroFuncionario="Nome do funcionário: "+nomeFun+"\nNúmero de registro: "+registroFun+"\nAno em que foi contratado: "+anoAdmissao+"\nSalário atual: R$"+salarioFun;
		return CadastroFuncionario;
	}
}
