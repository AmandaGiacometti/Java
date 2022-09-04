package lista06HerancaEPolimorfismoEx03;
import java.util.ArrayList;
import java.util.Collection;

public class Estoque {
	
	/*
	ENUNCIADO DO EXERCÍCIO:
	Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
	trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
	programa deverá atender as seguintes funcionalidades:
	Armazenar dados da List
	Remover dados da list;
	Atualizar dados da list.
	Apresentar todos os dados da list.
	*/
	
	public static void main (String args[])
	{
		
		Collection<String> produtos = new ArrayList();
		produtos.add("Camiseta");
		produtos.add("Calça");
		produtos.add("Vestido");
		produtos.add("Bota");
		produtos.add("Cachecol");
		produtos.add("Saia");
		System.out.println("Lista de nomes: "+produtos);
		
		produtos.remove("Cachecol");
		produtos.remove("Bota");
		System.out.println("Lista de nomes: "+produtos);
		
		for(String product : produtos)
		{
			System.out.println("Produto: "+product);
		}
		
	}
}
