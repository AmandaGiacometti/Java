package lista05OrientacaoAObjetosEx07;

public class DadosPaciente {
	
	private String nomePaciente;
	private String nomeMae;
	private String idadePaciente;
	private String tipoSanguineo;
	private String motivoInternacao;
	
	public DadosPaciente (String nome,String mae,String idade,String sangue,String doenca)
	{
		nomePaciente=nome;
		nomeMae=mae;
		idadePaciente=idade;
		tipoSanguineo=sangue;
		motivoInternacao=doenca;
	}
	
	public String getProntuarioPaciente()
	{
		String ProntuarioPaciente="Nome do paciente: "+nomePaciente+"\nNome da mãe: "+nomeMae+"\nIdade: "+idadePaciente+"\nTipo sanguíneo: "+tipoSanguineo+"\nMotivo da internação: "+motivoInternacao;
		return ProntuarioPaciente;
	}

}
