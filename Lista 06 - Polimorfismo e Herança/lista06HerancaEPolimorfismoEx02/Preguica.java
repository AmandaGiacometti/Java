package lista06HerancaEPolimorfismoEx02;

public class Preguica extends Animal {
	
	private String preguicinha;
	
	public Preguica()
	{
		
	}

	public String getPreguicinha() {
		return preguicinha;
	}

	public void setPreguicinha(String preguicinha) {
		this.preguicinha = preguicinha;
	}

	public String getSom()
	{
		return "Animal: "+this.getPreguicinha()+" - Som que ele faz: "+super.getSom();
	}
}
