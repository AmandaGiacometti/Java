package lista03LacosDeRepeticao;
import java.util.Scanner;
public class lista03ex04 {
	
	public static void main (String args[])
	{
		/*
		ENUNCIADO DO EXERCÍCIO:
		Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
		Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
		e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
		o número de pessoas calmas; 
		o número de mulheres nervosas; 
		o número de homens agressivos; 
		o número de outros calmos;
		o número de pessoas nervosas com mais de 40 anos; 
		o número de pessoas calmas com menos de 18 anos.
		 */
		
		Scanner leia = new Scanner(System.in);
		int idade,genero,psico,contum=0,contdois=0,conttres=0,contquatro=0,contcinco=0,contseis=0,p=1;
		
		while(p<=150)
		{
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			System.out.println("\n"+"Digite o número indicado, de acordo com seu gênero: "+"\n"+"1- Feminino"+"\n"+"2- Masculino"+"\n"+"3- Não binárie");
			genero = leia.nextInt();
			System.out.println("\n"+"Digite o número indicado, de acordo com sua personalidade: "+"\n"+"1- Sou calmo(a)(e)"+"\n"+"2- Sou nervoso(a)(e)"+"\n"+"3- Sou agressivo(a)(e)");
			psico = leia.nextInt();
			
			if(psico==1)
			{
				contum++;
			}
			if(genero==2 && psico==2)
			{
				contdois++;
			}
			if(genero==1 && psico==3)
			{
				conttres++;
			}
			if(genero==3 && psico==1) 
			{
				contquatro++;
			}
			if(psico==2 && idade>40 && idade<122)
			{
				contcinco++;
			}
			if(psico==1 && idade<18 && idade>0)
			{
				contseis++;
			}
			p++;
		}
		
		System.out.println("\n"+"Número de pessoas calmas: "+contum);
		System.out.println("Número de mulheres nervosas: "+contdois);
		System.out.println("Número de homens agressivos: "+conttres);
		System.out.println("Número de não bináries calmes: "+contquatro);
		System.out.println("Número de pessoas nervosas com mais de 40 anos: "+contcinco);
		System.out.println("Número de pessoas calmas com menos de 18 anos: "+contseis);
		
		/*
		 Fiz quase tudo sozinha mas tava dando erro
		 Os meninos me ajudaram e eu consegui :)
		 Mais do que conseguir, eu entendi, tô feliz
		 */		
	}

}
