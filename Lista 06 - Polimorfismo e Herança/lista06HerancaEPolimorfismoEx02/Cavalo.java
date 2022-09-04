package lista06HerancaEPolimorfismoEx02;

public class Cavalo extends Animal {
	
	private String cavalinho;
	
	public Cavalo()
	{
		
	}

	public String getCavalinho() {
		return cavalinho;
	}

	public void setCavalinho(String cavalinho) {
		this.cavalinho = cavalinho;
	}

	public String getSom()
	{
		return "Animal: "+this.getCavalinho()+" - Som que ele faz: "+super.getSom();
	}
}
