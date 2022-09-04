package lista06HerancaEPolimorfismoEx01;

public class MainAnimal {

	/*
	ENUNCIADO DO EXERCÍCIO:
	Crie uma hierarquia de classes conforme a imagem, com os seguintes atributos e
	comportamentos (observe a tabela na imagem), utilize os seus conhecimentos e distribua as
	características de forma que tudo o que for comum a todos os animais fique na classe animal
	*/
	
	public static void main (String args[])
	{
		Animal mamifero = new Animal("Gatinho",13,"miau");
		Cachorro doguinho = new Cachorro("Cachorrinho",9,"au au","pouco");
		Cavalo cavalinho = new Cavalo("Cavalinho",4,"rinch rinch","muito");
		Preguica deboinha = new Preguica("Bichinho preguiça",1,"zzzz","sobe");
		
		System.out.println("Tem um animal que faz o seguinte som: "+mamifero.getSom());
		System.out.println("Um cachorro que tem a seguinte idade: "+doguinho.getIdade());
		System.out.println("Cavalo corre? "+cavalinho.getCorrer());
		System.out.println("Bicho preguiça sobe em árvore? "+deboinha.getSubirArvore());		
	}
}
