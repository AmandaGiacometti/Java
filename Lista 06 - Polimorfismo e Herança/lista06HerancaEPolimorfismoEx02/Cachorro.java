package lista06HerancaEPolimorfismoEx02;

public class Cachorro extends Animal {
		
	private String dog;
	
	public Cachorro()
	{
		
	}
		
	public String getDog() {
		return dog;
	}

	public void setDog(String dog) {
		this.dog = dog;
	}

	public String getSom()
	{
		return "Animal: "+this.getDog()+" - Som que ele faz: "+super.getSom();
	}
}
