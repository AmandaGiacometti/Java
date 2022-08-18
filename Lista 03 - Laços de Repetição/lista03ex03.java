package lista03LacosDeRepeticao;
import java.util.Scanner;
public class lista03ex03 {
	public static void main (String args[])
	{
		/*
		 ENUNCIADO DO EXERCÍCIO:
		 Solicitar a idade de várias pessoas e imprimir: 
		 Total de pessoas com menos de 21 anos. 
		 Total de pessoas com mais de 50 anos. 
		 O programa termina quando idade for =-99. (WHILE)
		 */
		
		int idade,contagemx=0,contagemy=0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("(Caso queira sair, digite: -99)"+"\n"+"\n"+"Digite a sua idade: ");
		idade = leia.nextInt();
		
		while(idade!=-99) 
		{
			if(1<=idade && idade<21)
			{
				contagemx++;
			}
			else if(50<idade && idade<122)
			{
				contagemy++;
			}
			else if(idade<=0)
			{
				System.out.println("\n"+"Idade inválida!");
			}	
		
			System.out.println("\n"+"Total de pessoas com menos de 21 anos (até agora): "+contagemx);
			System.out.println("\n"+"Total de pessoas com mais de 50 anos (até agora): "+contagemy);
			System.out.println("\n"+"(Caso queira sair, digite: -99)"+"\n"+"\n"+"Digite a sua idade: ");
			idade = leia.nextInt();
		}
		
		/*
		 Conseguiii fiz quase tudo sozinha mas tava dando erro
		 Os meninos me ajudaram e deu certo
		 Eu realmente entendi e to felizzzz 		
		 */		
		
	}

}
