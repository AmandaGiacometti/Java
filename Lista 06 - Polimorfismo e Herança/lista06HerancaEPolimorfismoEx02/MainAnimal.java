package lista06HerancaEPolimorfismoEx02;

public class MainAnimal {
	public static void main (String args[])
	{
		/*
		ENUNCIADO DO EXERCÍCIO:
		Implemente um programa que crie os 3 tipos de animais definidos no exercício
		anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
		é, independente do tipo de animal.
		*/
		
		
		Cachorro cachorro = new Cachorro();
		cachorro.setSom("au au");
		cachorro.setDog("cachorro");
		
		Cavalo cavalo = new Cavalo();
		cavalo.setSom("rinch rinch");
		cavalo.setCavalinho("cavalo");
		
		Preguica preguica = new Preguica();
		preguica.setSom("zzzzz...");
		preguica.setPreguicinha("bicho preguiça");
		
		Animal[] animais = new Animal[3];
		animais[0]=cachorro;
		animais[1]=cavalo;
		animais[2]=preguica;
		
		for(Animal animal:animais)
		{
			System.out.println(animal.getSom());
		}		
	}
}
